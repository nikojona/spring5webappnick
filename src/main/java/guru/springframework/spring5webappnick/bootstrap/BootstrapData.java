package guru.springframework.spring5webappnick.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webappnick.domain.Author;
import guru.springframework.spring5webappnick.domain.Book;
import guru.springframework.spring5webappnick.domain.Publisher;
import guru.springframework.spring5webappnick.repositories.AuthorRepository;
import guru.springframework.spring5webappnick.repositories.BookRepository;
import guru.springframework.spring5webappnick.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
		
	public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Started ini Bootstrap");
		
		Publisher publisher = new Publisher();
		publisher.setName("SFG Publishing");
		publisher.setCity("St Petersburg");
		publisher.setState("FL");
		
		publisherRepository.save(publisher);
		
		System.out.println("Publihser count: " + publisherRepository.count());
		
		Author eric = new Author("Eric","Evans");
		Book ddd = new Book("Domain Driven Design", "123123");
		
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		ddd.setPublisher(publisher);
		publisher.getBooks().add(ddd);
		
		authorRepository.save(eric);
		bookRepository.save(ddd);
		publisherRepository.save(publisher);
		
//		-------------------------------------------

		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development without EJB","987654321");
		
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		
		noEJB.setPublisher(publisher);
		publisher.getBooks().add(noEJB);
		
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		publisherRepository.save(publisher);
		
//		-------------------------------------------
		
		System.out.println("Number of Books: " + bookRepository.count());
		System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
	}
	
	
}
