package project.songsLibrary;

import project.songsLibrary.Entity.*;
import project.songsLibrary.Repository.AlbumRepository;
import project.songsLibrary.Repository.ArtistsRepository;
import project.songsLibrary.Repository.PlaylistRepository;
import project.songsLibrary.Repository.SongsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class Services {

    private SongsRepository songsRepository;
    private ArtistsRepository artistsRepository;
    private PlaylistRepository playlistRepository;
    private AlbumRepository albumRepository;

    public Services(SongsRepository songsRepository, ArtistsRepository artistsRepository, PlaylistRepository playlistRepository, AlbumRepository albumRepository) {
        this.songsRepository = songsRepository;
        this.artistsRepository = artistsRepository;
        this.playlistRepository = playlistRepository;
        this.albumRepository = albumRepository;
    }

    public List<Songs> getAllSongs() {
        return songsRepository.findAll();
    }

    public Songs saveSongs(Songs songs) {
        return songsRepository.save(songs);
    }

    public String deleteSongById(Integer id) {
        songsRepository.deleteById(id);
        return "Song deleted successfully.";
    }

    public List<Artists> getAllArtists() {
        return artistsRepository.findAll();
    }

    public Artists saveArtists(Artists artists) {
        return artistsRepository.save(artists);
    }

    public String deleteArtistById(Integer id) {
        artistsRepository.deleteById(id);
        return "Artist deleted successfully.";
    }

    // creating album with songs and artists in it
    public Album createAlbum(Album album) throws MyException {
            Artists artist = artistsRepository.findById(album.getArtist().getId())
                    .orElseThrow(() -> new MyException("Artist not found"));

            List<Songs> songs = album.getSongs().stream()
                    .map(song -> {
                        try {
                            return songsRepository.findById(song.getId())
                                    .orElseThrow(() -> new MyException("Song not found: " + song.getId()));
                        } catch (MyException exception) {
                            throw new RuntimeException(exception);
                        }
                    })
                    .collect(Collectors.toList());
            album.setArtist(artist);
            album.setSongs(songs);

        return albumRepository.save(album);
    }

    // creating a playlist only with songs
    public Playlist createPlaylist(Playlist playlist) throws MyException {

            List<Songs> songs = playlist.getSongs().stream()
                    .map(song -> {
                        try {
                            return songsRepository.findById(song.getId())
                                    .orElseThrow(() -> new MyException("Song not found: " + song.getId()));
                        } catch (MyException exception) {
                            throw new RuntimeException(exception);
                        }
                    })
                    .collect(Collectors.toList());

            playlist.setSongs(songs);
            return playlistRepository.save(playlist);
    }

    public void removeSongFromPlaylist(Integer playlistId, Integer songId) throws MyException {
        Playlist playlist = playlistRepository.findById(playlistId)
                .orElseThrow(() -> new MyException("No such playlist"));

        Optional<Songs> songToRemove = playlist.getSongs().stream()
                .filter(song -> song.getId().equals(songId))
                .findFirst();

        if (songToRemove.isPresent()) {
            playlist.getSongs().remove(songToRemove.get());
            playlistRepository.save(playlist);
        } else {
            throw new MyException("Song not found in playlist");
        }
    }

    public List<Statistics> getStatisticsForSongs() {
        List<Songs> songs = songsRepository.findAll();

        return songs.stream()
                .map(song -> new Statistics(song.getSongsName(), song.getSongsDuration()))
                .collect(Collectors.toList());
    }
}
