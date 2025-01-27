package project.songsLibrary.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import project.songsLibrary.Entity.Songs;

import java.util.List;

// Initially wrote this class for statistics to show songs title and durations
public class CustomSongsRepositoryImpl implements CustomSongsRepository {

    // This is an annotation that I added to interact with my database as read and write the queries.
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Songs> findSongsByTitleContaining(String keyword) {
        String jpql = "SELECT s FROM Songs s WHERE s.songsName LIKE :keyword";
        return entityManager.createQuery(jpql, Songs.class)
                .setParameter("keyword", "%" + keyword + "%")
                .getResultList();
    }

    @Override
    public int countSongsByDurationGreaterThan(int duration) {
        String jpql = "SELECT COUNT(s) FROM Songs s WHERE s.songsDuration > :duration";
        Long count = entityManager.createQuery(jpql, Long.class)
                .setParameter("duration", duration)
                .getSingleResult();
        return count.intValue();
    }
}
