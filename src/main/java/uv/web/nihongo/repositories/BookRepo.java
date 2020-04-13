package uv.web.nihongo.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uv.web.nihongo.entities.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {
    // @Query(value="Select b from Book b where b.name like ?1 and b.test=?2")
    // Book findByTest(String test, String );
}