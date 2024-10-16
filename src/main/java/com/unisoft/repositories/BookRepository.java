package com.unisoft.repositories;

import com.unisoft.entity.Book;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {
    public List<Book> getAllBooks() {
        return List.of(
                new Book(1, "Understanding Quarkus", "Antonio", 2020, "IT", "isbn1"),
                new Book(2, "Practising Quarkus", "Antonio", 2020, "IT", "isbn2"),
                new Book(3, "Effective Java", "Josh Blocj", 2001, "IT", "isbn3"),
                new Book(4, "Thinking in Java", "Bruce Eckel", 1998, "IT", "isbn4"),
                new Book(5, "Quarkus and React Tutorial", "Pierre Lasante", 2024, "IT", "isbn5")
        );
    }

    public Optional<Book> getBookById(int id) {
        return getAllBooks().stream()
                .filter(book -> book.id == id)
                .findFirst();
    }
}
