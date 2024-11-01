package com.moulali.first_spring_boot;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

public class BookJpaService implements BookRepository {

    @Autowired
    private BookJpaRepository bookJpaRepository;

    @Override
    public ArrayList<Book> getBooks() {
        List<Book> booksList=bookJpaRepository.findAll();
        ArrayList<Book> book=new ArrayList<>(booksList);
        return book;
    }

    @Override
    public Book getBookById(int bookId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBookById'");
    }

    @Override
    public Book addBook(Book book) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addBook'");
    }

    @Override
    public Book updateBook(int bookId, Book book) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBook'");
    }

    @Override
    public void deleteBook(int bookId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBook'");
    }
    
}
