package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Set<Book> getBookList() {
        return bookRepository.getBookList(1);
    }
}
