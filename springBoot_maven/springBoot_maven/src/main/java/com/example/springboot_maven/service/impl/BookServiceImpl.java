package com.example.springboot_maven.service.impl;

import com.example.springboot_maven.mapper.BookDao;
import com.example.springboot_maven.pojo.Book;
import com.example.springboot_maven.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao BookDao;

    @Override
    public Book getBookById(int Id) {
        return BookDao.getBookById(Id);
    }

    @Override
    public List<Book> getAllBooks() {
        return BookDao.getAllBooks();
    }

    @Override
    public int addBook(Book book) {
        return BookDao.addBook(book);
    }

    @Override
    public int deleteBook(int Id) {
        return BookDao.deleteBook(Id);
    }

    @Override
    public int updateBook(Book book) {
        return BookDao.updateBook(book);

    }
}
