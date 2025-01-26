package project.songsLibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.songsLibrary.Entity.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {
}
