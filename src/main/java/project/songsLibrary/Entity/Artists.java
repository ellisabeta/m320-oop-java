package project.songsLibrary.Entity;

import jakarta.persistence.*;

@Entity
public class Artists {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer followers;

    @ManyToOne
    @JoinColumn(name = "songs_id")
    private Songs songs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Songs getSongs() {
        return songs;
    }

    public void setSongs(Songs songs) {
        this.songs = songs;
    }
}
