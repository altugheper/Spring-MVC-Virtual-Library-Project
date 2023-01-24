package com.tpe.service;

import com.tpe.domain.Books;

import java.util.List;

public interface BookService {

    List<Books> getAllBooks();

    Books findBookById(Long id);

    void saveBook(Books books);

    void updateBook(Books books);

    void deleteBook(Long id);
}
