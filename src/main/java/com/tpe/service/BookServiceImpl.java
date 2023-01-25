package com.tpe.service;

import com.tpe.domain.Books;
import com.tpe.exception.ResourceNotFoundException;
import com.tpe.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository repository;

    @Override
    public List<Books> getAllBooks() {
        return repository.getAll();
    }

    @Override
    public Books findBookById(Long id) {
        Books books = repository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Book cannot be found: " + id));
        return books;
    }

    @Override
    public void saveBook(Books books) {
        repository.save(books);
    }

    @Override
    public void updateBook(Books books) {
        repository.update(books);
    }

    @Override
    public void deleteBook(Long id) {
        repository.delete(id);
    }
}
