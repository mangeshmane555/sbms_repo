package in.mane.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.mane.entity.Book;
import java.util.List;


@RepositoryRestResource(path = "books")
public interface BookRepository extends JpaRepository<Book, Integer>{

	public List<Book> findByNameContaining(@Param("b_name") String name);
	
	
	
}
