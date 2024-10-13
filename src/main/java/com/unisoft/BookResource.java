package com.unisoft;

import com.unisoft.entity.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import java.util.List;
import java.util.Optional;

@Path("/api/books")
public class BookResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBooks() {
        return List.of(
            new Book(1, "Understanding Quarkus", "Antonio", 2020, "IT", "isbn1"),
            new Book(2, "Practising Quarkus", "Antonio", 2020, "IT", "isbn2"),
            new Book(3, "Effective Java", "Josh Blocj", 2001, "IT", "isbn3"),
            new Book(4, "Thinking in Java", "Bruce Eckel", 1998, "IT", "isbn4")
        );
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int countAllBooks() {
        return getAllBooks().size();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Book> getBookById(@PathParam("id") int id) {
        return getAllBooks().stream().filter((book) -> book.id == id).findFirst();
    }

}
