package guru.springframework.spring5webappnick.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webappnick.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
