package project.songsLibrary.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.songsLibrary.Entity.Songs;
import project.songsLibrary.Repository.Repository;

@RestController("/api")
public class Controller {

    @Autowired
    private Repository repository;

    @GetMapping("/songs")
    public Iterable<Songs> getSongs() {
        return this.repository.findAll();
    }

    @PostMapping("/songs")
    public Songs createSongs(@RequestBody Songs songs) {
        songs.id= null;
        return this.repository.save(songs);
    }

    @GetMapping()
    public String getArtists() {
        return "Hello World";
    }
}
