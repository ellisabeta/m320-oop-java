package project.songsLibrary.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Artists {

    @Id
    private int id;

    @Column
    private String name;

    @Column
    private Integer followers;
}
