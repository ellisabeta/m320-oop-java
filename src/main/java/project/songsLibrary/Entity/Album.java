package project.songsLibrary.Entity;

import jakarta.persistence.*;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String albumName;

    @ManyToOne
    @JoinColumn(name = "songs_id")
    private Songs songs;

}
