package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        System.out.println(" BookService Bean Initialized (Spring DI Working)");
    }

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println(" Dependency Injected: BookRepository → BookService");
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println(" [Service] Processing book addition: " + bookName);
        bookRepository.saveBook(bookName);
    }
}
