package project.songsLibrary.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import project.songsLibrary.Entity.Songs;
import project.songsLibrary.Repository.Repository;

@RestController("/api")
public class Controller {

    private Repository repository;

    @GetMapping("/songs")
    public String getSongs() {
        return "Hello World";
    }

    @PostMapping("/songs")
    public void createSongs(Songs songs) {
        this.repository.save(songs);
    }

    @GetMapping()
    public String getArtists() {
        return "Hello World";
    }
}
