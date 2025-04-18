package project.songsLibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.songsLibrary.Entity.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Services service;

    // Songs api requests
    @GetMapping("/songs")
    public List<Songs> getSongs() {
        return this.service.getAllSongs();
    }

    @PostMapping("/songs")
    public Songs createSongs(@RequestBody Songs songs) {
        return this.service.saveSongs(songs);
    }

    @DeleteMapping("/songs/{id}")
    public String deleteSong(@PathVariable Integer id) {
        return service.deleteSongById(id);
    }

    // Artists api requests
    @GetMapping("/artists")
    public List<Artists> getArtists() {
        return service.getAllArtists();
    }

    @PostMapping("/artists")
    public Artists createArtists(@RequestBody Artists artists) {
        return service.saveArtists(artists);
    }

    @DeleteMapping("/artists/{id}")
    public String deleteArtist(@PathVariable Integer id) {
        return service.deleteArtistById(id);
    }

    // Albums api requests
    @PostMapping("/albums")
    public Album createAlbum(@RequestBody Album albumRequest) throws MyException {
        return service.createAlbum(albumRequest);
    }

    // Playlists api requests
    @PostMapping("/playlists")
    public Playlist createPlaylist(@RequestBody Playlist playlistRequest) throws MyException {
        return service.createPlaylist(playlistRequest);
    }

    @DeleteMapping("/playlists/{playlistId}/songs/{songId}")
    public void removeSongFromPlaylist(@PathVariable Integer playlistId, @PathVariable Integer songId) throws MyException {
        service.removeSongFromPlaylist(playlistId, songId);
    }

    @GetMapping("/statistiks")
    public List<Statistics> getStatistics() {
        return service.getStatisticsForSongs();
    }
}
