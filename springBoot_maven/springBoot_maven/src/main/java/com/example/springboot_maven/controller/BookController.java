package com.example.springboot_maven.controller;

import com.example.springboot_maven.pojo.Book;
import com.example.springboot_maven.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class  BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/getBookByName")
    public Book getBookById(int Id) {
        Book book = bookService.getBookById(Id);
        return book;
    }

    @RequestMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        List<Book> book = bookService.getAllBooks();
        return book;
    }

    @RequestMapping("/addBook")
    public int addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @RequestMapping("/deleteBook")
    public int deleteBook(int Id) {
        return bookService.deleteBook(Id);
    }
    @RequestMapping("/updateBook")
    public int updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }
}
