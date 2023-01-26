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



    }

    @Override
    public Optional<Books> findById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Books books = session.get(Books.class,id);
        Optional<Books> opt;
        opt = Optional.ofNullable(books);


        tx.commit();
        session.close();
        return opt;
    }

    @Override
    public void save(Books books) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.saveOrUpdate(books);

        tx.commit();
        session.close();
    }

    @Override
    public void update(Books books) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.update(books);

        tx.commit();
        session.close();

    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Books books = session.load(Books.class,id);
        session.delete(books);

        tx.commit();
        session.close();

    }
}
