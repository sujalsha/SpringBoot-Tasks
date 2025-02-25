package com.bookstore.Bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bookstore.Bookstore.Models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
