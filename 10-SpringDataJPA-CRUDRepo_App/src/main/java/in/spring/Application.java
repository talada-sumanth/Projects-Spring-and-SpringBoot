package in.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.spring.entity.Book;
import in.spring.repo.BookRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(Application.class, args);
		
		BookRepo br = ctx.getBean(BookRepo.class);
		
		Optional<Book> optional = br.findById(103);
		optional.ifPresent(book -> {
		    book.setBookName("java");
		    br.save(book);
		});

		
		List<Book> books = br.findByBookName("java");
		
		for(Book b : books) {
			System.out.println(b);
		}
	}

}
