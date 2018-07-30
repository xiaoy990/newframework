package com.pandawork.mapper;

import com.pandawork.common.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    public List<Book> listAllBooks() throws Exception;

    public boolean addBooks(@Param("book") Book book) throws Exception;

    public boolean delBook(@Param("id") int id) throws Exception;

    public boolean updateBook(@Param("book") Book book) throws Exception;

    public List<Book> searchBook(String bookname) throws Exception;
}
