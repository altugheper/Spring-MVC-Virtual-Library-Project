package com.tpe.repository;

import com.tpe.domain.Books;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

    List<Books> getAll();

    Optional<Books> findById(Long id);

    void save(Books books);

    void update(Books books);

    void delete(Long id);

    // 36:15
}
