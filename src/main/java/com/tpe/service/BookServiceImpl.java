package com.tpe.service;

import com.tpe.domain.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Override
    public List<Books> getAllBooks() {
        return null;
    }

    @Override
    public Books findBookById(Long id) {
        return null;
    }

    @Override
    public void saveBook(Books books) {

    }

    @Override
    public void updateBook(Books books) {

    }

    @Override
    public void deleteBook(Long id) {

    }
}
