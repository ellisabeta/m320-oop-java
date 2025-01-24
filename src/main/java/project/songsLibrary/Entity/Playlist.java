package project.songsLibrary.Entity;

import jakarta.persistence.*;

@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String playlistName;

    @Column
    private String playlistDuration;

    @ManyToOne
    @JoinColumn(name = "songs_id")
    private Songs songs;

    public void addSong(Songs songs) {
        return;
    }
}
