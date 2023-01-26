package com.tpe.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Book name cannot be empty")
    @Length(min = 3, message = "Author name must be at least 3 characters")
    private String bookName;

    @NotEmpty(message = "Author name cannot be empty")
    @Length(min = 3, message = "Author name must be at least 3 characters")
    private String author;

    private LocalDateTime createDate = LocalDateTime.now();

    public Books() {
    }

    public Books(Long id, String bookName, String author, LocalDateTime createDate) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

//    public void setCreateDate(LocalDateTime createDate) {
//        this.createDate = createDate;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
