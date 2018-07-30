package com.pandawork.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_bookshare")
@Entity
public class Book {
    @Id
    int id;

    @Column(name = "bookname")
    String bookname = null;

    @Column(name = "author")
    String author = null;

    @Column(name = "country")
    String country = null;

    @Column(name = "introduction")
    String introduction = null;

    @Column(name = "publisher")
    String publisher = null;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", country='" + country + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
