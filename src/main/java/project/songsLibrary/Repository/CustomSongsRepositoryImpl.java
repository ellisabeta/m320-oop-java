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

    // This method will find songs by the title, which is case-sensitive
    @Override
    public List<Songs> findSongsByTitleContaining(String keyword) {
        // A jpql statement to find the typed in keyword from songs entity
        String jpql = "SELECT s FROM Songs s WHERE s.songsName LIKE :keyword";
        // I set here a value to the keyword and then get the list in the createQuery which uses the string statement from above
        return entityManager.createQuery(jpql, Songs.class)
                // using the % sign it matches all the options of what the query found with the keyword that the user types in
                .setParameter("keyword", "%" + keyword + "%")
                .getResultList();
    }

    @Override
    public int countSongsByDurationGreaterThan(int duration) {
        // Here is again a jpql statement to find from songs the duration which is greater that the duration that I set
        String jpql = "SELECT COUNT(s) FROM Songs s WHERE s.songsDuration > :duration";
        // from the string above it creates a Query and then set the value for duration
        Long count = entityManager.createQuery(jpql, Long.class)
                .setParameter("duration", duration)
                .getSingleResult();
        // convert my count variable from Long to int
        return count.intValue();
    }
}
