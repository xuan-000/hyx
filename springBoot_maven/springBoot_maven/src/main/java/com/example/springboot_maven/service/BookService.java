package com.example.springboot_maven.service;

import com.example.springboot_maven.pojo.Book;

import java.util.List;

public interface BookService {
    Book getBookById(int id);
    List<Book> getAllBooks();
    int addBook(Book book);
    int updateBook(Book book);
    int deleteBook(int Id);
}
