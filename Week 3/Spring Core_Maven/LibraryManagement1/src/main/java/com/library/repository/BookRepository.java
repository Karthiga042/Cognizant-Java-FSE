package com.library.repository;

public class BookRepository {

    public BookRepository() {
        System.out.println(" BookRepository Bean Initialized (Spring DI Working)");
    }

    public void saveBook(String bookName) {
        System.out.println(" [Repository] Book saved successfully: " + bookName);
    }
}
