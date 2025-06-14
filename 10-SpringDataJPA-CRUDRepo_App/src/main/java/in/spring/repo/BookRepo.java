package in.spring.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.spring.entity.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Integer> {
	
	List<Book> findByBookName(String bookName);
}
