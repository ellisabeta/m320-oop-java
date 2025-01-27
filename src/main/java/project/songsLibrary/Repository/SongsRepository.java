package project.songsLibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.songsLibrary.Entity.Songs;

public interface SongsRepository extends JpaRepository<Songs, Integer>, CustomSongsRepository {
}
