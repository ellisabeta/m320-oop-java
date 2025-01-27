package project.songsLibrary.Repository;

import project.songsLibrary.Entity.Songs;

import java.util.List;

public interface CustomSongsRepository {

    List<Songs> findSongsByTitleContaining(String keyword);
    int countSongsByDurationGreaterThan(int duration);
}
