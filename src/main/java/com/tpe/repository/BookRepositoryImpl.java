package com.tpe.repository;

import com.tpe.domain.Books;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookRepositoryImpl implements BookRepository{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Books> getAll() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        List<Books> listOfBooks = session.createQuery("FROM Books",Books.class).
                getResultList();

        tx.commit();
        session.close();
        return listOfBooks;

        // 1:09

    }

    @Override
    public Optional<Books> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Books books) {

    }

    @Override
    public void update(Books books) {

    }

    @Override
    public void delete(Long id) {

    }
}
