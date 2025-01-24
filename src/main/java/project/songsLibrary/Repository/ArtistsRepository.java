package project.songsLibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.songsLibrary.Entity.Artists;

public interface ArtistsRepository extends JpaRepository<Artists, Integer> {
}
