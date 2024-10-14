package com.unisoft;

import com.unisoft.entity.Book;
import com.unisoft.repositories.BookRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import java.util.List;
import java.util.Optional;

@Path("/api/v1/books")
public class BookResource {

    @Inject
    BookRepository bookRepository;
    @Inject
    Logger logger;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBooks() {
        logger.info("getAllBooks");
        return bookRepository.getAllBooks();
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int countAllBooks() {
        logger.info("Returns the number of all books: " + bookRepository.getAllBooks().size());
        return bookRepository.getAllBooks().size();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Book> getBookById(@PathParam("id") int id) {
        logger.info("Returns the book by id: " + id);
        return bookRepository.getBookById(id).stream().filter((book) -> book.id == id).findFirst();
    }

}
