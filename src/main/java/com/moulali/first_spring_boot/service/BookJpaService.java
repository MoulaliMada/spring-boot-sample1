package com.moulali.first_spring_boot.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.moulali.first_spring_boot.model.Book;
import com.moulali.first_spring_boot.repository.BookJpaRepository;
import com.moulali.first_spring_boot.repository.BookRepository;

@Service
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
        try{
            Book book=bookJpaRepository.findById(bookId).get();
            return book;
        }catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Book addBook(Book book) {
        bookJpaRepository.save(book);
        return book;
    }

    @Override
    public Book updateBook(int bookId, Book book) {
        try{
            Book newbook=bookJpaRepository.findById(bookId).get();
            if(book.getName() != null){
                newbook.setName(book.getName());
            }
            if(book.getImageUrl() != null){
                newbook.setImageUrl(book.getImageUrl());
            }
            bookJpaRepository.save(newbook);
            return newbook;
        }catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void deleteBook(int bookId) {
        try{
            bookJpaRepository.deleteById(bookId);
        }catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
    
}
