package librarymanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import librarymanagement.entity.Book;


public interface BookRepo extends JpaRepository<Book,Integer>  {
	
	
}
