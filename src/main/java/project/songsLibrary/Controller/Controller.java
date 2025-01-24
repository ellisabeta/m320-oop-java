package project.songsLibrary.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.songsLibrary.Entity.Artists;
import project.songsLibrary.Entity.Songs;
import project.songsLibrary.Service.Services;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Services service;

    @GetMapping("/songs")
    public List<Songs> getSongs() {
        return this.service.getAllSongs();
    }

    @PostMapping("/songs")
    public Songs createSongs(@RequestBody Songs songs) {
        return this.service.saveSongs(songs);
    }

    @GetMapping("/artists")
    public List<Artists> getArtists() {
        return service.getAllArtists();
    }

    @PostMapping("/artists")
    public Artists createArtists(@RequestBody Artists artists) {
        return service.saveArtists(artists);
    }
}
