package com.bookstore.Bookstore.Controller;

import com.bookstore.Bookstore.Repository.BookRepository;
import com.bookstore.Bookstore.Models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BookstoreController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/add-books")
    public ResponseEntity<Map<String, String>> addBook(@RequestBody Book book) {
        bookRepository.save(book);
        Map<String, String> response = new HashMap<>();
        response.put("Status", "Book Added");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/find-books")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> book = bookRepository.findAll();
        return ResponseEntity.ok(book);
    }
}
