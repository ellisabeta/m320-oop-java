package project.songsLibrary.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Songs {

    @Id
    private int id;

    @Column
    public String songsName;
}
