package guru.springframework.spring5webappnick.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webappnick.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
