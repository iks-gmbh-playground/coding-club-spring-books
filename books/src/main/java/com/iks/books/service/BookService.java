package com.iks.books.service;

import com.iks.books.entity.Book;
import com.iks.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public Optional<Book> getBook(long id) {
        return bookRepository.findById(id);
    }
}
