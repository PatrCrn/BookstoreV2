package com.example.Bookstore.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
    List<Book> findByAuthor(String author);
}
