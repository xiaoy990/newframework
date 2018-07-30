package com.pandawork.service;

import com.pandawork.common.entity.Book;
import com.pandawork.core.common.exception.SSException;

import java.util.List;

public interface BookService {

    public List<Book> listAllBooks() throws SSException;
    public void addBook(Book book) throws  SSException;
    public void del(int id) throws SSException;
    public void update(Book book) throws SSException;
    public List<Book> searchBook(String bookname) throws SSException;

}
