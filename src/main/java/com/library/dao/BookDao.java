package com.library.dao;

import com.library.bean.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

public interface BookDao {


    int matchBook(String searchWord);

    ArrayList<Book> queryBook(String searchWord);

    ArrayList<Book> getAllBooks();

    int addBook(Book book);

    Book getBook(long bookId);

    int editBook(Book book);

    int deleteBook(long bookId);
}
