package com.example.springboot_maven.mapper;

import com.example.springboot_maven.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookDao {
    @Select("SELECT * FROM book WHERE Id = #{Id}")
    Book getBookById(int Id);
    @Select("SELECT * FROM book")
    List <Book> getAllBooks();
    @Insert("INSERT INTO book (Id,bookName,bookPrice) VALUES (#{Id},  #{bookName},  #{bookPrice})")
    int addBook(Book book);
    @Delete("DELETE FROM book WHERE bookId = #{Id}")
    int deleteBook(int Id);
    @Update("UPDATE book SET bookPrice = #{bookPrice} WHERE bookId = #{Id}")
    int updateBook(Book book);
}
