package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookRepository {

    public Set<Book> getBookList() {
        Set<Book> books = new HashSet<>();
        Book book = new Book();
        book.setName("Spring in Action");
        book.setPublishDate(new Date(2005));
        Book book2 = new Book();
        book2.setName("Java in Action");
        book2.setPublishDate(new Date(2015));
        Book book3 = new Book();
        book3.setName("JavaScript in Action");
        book3.setPublishDate(new Date(2025));
        books.add(book);
        books.add(book2);
        books.add(book3);
        return books;
    }

    public Set<Book> getBookList(int a) {
        return null;
    }
}
