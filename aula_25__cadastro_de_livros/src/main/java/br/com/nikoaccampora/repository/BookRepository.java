package br.com.nikoaccampora.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.nikoaccampora.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
	
}
