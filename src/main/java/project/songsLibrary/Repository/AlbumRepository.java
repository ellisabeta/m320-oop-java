package project.songsLibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.songsLibrary.Entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
}
