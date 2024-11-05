package com.moulali.first_spring_boot.repository;
import java.util.*;
import com.moulali.first_spring_boot.model.Book;

public interface BookRepository {
    ArrayList<Book> getBooks();
    Book getBookById(int bookId);
    Book addBook(Book book);
    Book updateBook(int bookId,Book book);
    void deleteBook(int bookId);
}
