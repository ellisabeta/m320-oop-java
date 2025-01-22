package project.songsLibrary.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    private Long id;
    @Column()
    public String name;
    @Column()
    public int age;
    @Column()
    public String email;
}
