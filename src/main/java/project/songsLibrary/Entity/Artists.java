package project.songsLibrary.Entity;

import jakarta.persistence.*;

@Entity
public class Artists {

    @Id
    private int id;

    @Column
    private String name;

    @Column
    private Integer followers;

    @ManyToOne
    @JoinColumn(name = "songs_id")
    private Songs songs;
}
