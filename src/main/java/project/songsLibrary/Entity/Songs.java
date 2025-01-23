package project.songsLibrary.Entity;

import jakarta.persistence.*;

@Entity
public class Songs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column
    public String songsName;
}
