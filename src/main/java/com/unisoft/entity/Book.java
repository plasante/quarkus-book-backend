package com.unisoft.entity;

public class Book {

    public int id;
    public String title;
    public String author;
    public int yearOfPublication;
    public String genre;
    public String isbn;

    public Book(int id, String title, String author, int yearOfPublication, String genre, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
        this.isbn = isbn;
    }
}
