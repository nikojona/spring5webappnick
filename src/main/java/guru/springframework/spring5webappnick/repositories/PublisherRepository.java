package guru.springframework.spring5webappnick.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webappnick.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
