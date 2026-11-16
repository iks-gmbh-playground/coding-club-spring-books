package com.iks.books.rest;

import com.iks.books.entity.Book;
import com.iks.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/book")
    public void createBook(@RequestBody Book book) {
        service.addBook(book);
    }

    @GetMapping("/book/{id}")
    public Optional<Book> findBook(@PathVariable long id) {
        return service.getBook(id);
    }
}
