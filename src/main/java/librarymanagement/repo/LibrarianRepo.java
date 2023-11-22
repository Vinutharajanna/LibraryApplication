package librarymanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import librarymanagement.entity.Librarian;


public interface LibrarianRepo extends JpaRepository<Librarian,String>{}
