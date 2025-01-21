package project.songsLibrary.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping()
    public String getSongs() {
        return "Hello World";
    }

    @PostMapping()
    public String createSongs() {
        return "Hello World";
    }

    @GetMapping()
    public String getArtists() {
        return "Hello World";
    }
}
