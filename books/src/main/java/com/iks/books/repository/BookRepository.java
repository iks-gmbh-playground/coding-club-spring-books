package com.iks.books.repository;

import com.iks.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
