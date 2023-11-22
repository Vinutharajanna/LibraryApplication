package librarymanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import librarymanagement.entity.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer >{}
