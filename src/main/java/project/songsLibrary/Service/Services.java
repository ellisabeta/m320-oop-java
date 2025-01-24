package project.songsLibrary.Service;

import project.songsLibrary.Entity.Artists;
import project.songsLibrary.Entity.Songs;
import project.songsLibrary.Repository.ArtistsRepository;
import project.songsLibrary.Repository.SongsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {

    private SongsRepository songsRepository;
    private ArtistsRepository artistsRepository;

    public List<Songs> getAllSongs() {
        return songsRepository.findAll();
    }

    public Songs saveSongs(Songs songs) {
        return songsRepository.save(songs);
    }

    public List<Artists> getAllArtists() {
        return artistsRepository.findAll();
    }

    public Artists saveArtists(Artists artists) {
        return artistsRepository.save(artists);
    }
}
