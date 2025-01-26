package project.songsLibrary.Entity;

import jakarta.persistence.*;

@Entity
public class Songs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String songsName;

    @Column
    private int songsDuration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSongsName() {
        return songsName;
    }

    public void setSongsName(String songsName) {
        this.songsName = songsName;
    }

    public int getSongsDuration() {
        return songsDuration;
    }

    public void setSongsDuration(int songsDuration) {
        this.songsDuration = songsDuration;
    }
}
