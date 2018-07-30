package com.pandawork.service.impl;

import com.pandawork.common.entity.Book;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.framework.dao.CommonDao;
import com.pandawork.mapper.BookMapper;
import com.pandawork.service.BookService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    public List<Book> searchBook(String bookname) throws SSException{
        List<Book> list = null;
        try{
            list = bookMapper.searchBook(bookname);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public void update(Book book) throws SSException{
        try{
            bookMapper.updateBook(book);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

//    @Autowired
//    protected CommonDao commonDao;
    public void del(int id) throws SSException{
        try{
            bookMapper.delBook(id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public List<Book> listAllBooks() throws SSException {
//        InputStream in = null;
//        List<Book> list = null;
//        BookMapper bookMapper = null;
//        //加载Mybatis配置文件
//        try {
//            in = Resources.getResourceAsStream("testmybatis.xml");
//            //根据相关的mybatis配置文件， 创建连接SQLSessionFactory连接对象
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//            //创建出SQLSession对象
//            SqlSession sqlSeesion = factory.openSession();
//            //通过sqlSession取到映射接口
//            bookMapper = sqlSeesion.getMapper(BookMapper.class);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
        List<Book> list = null;
        try {
            list = bookMapper.listAllBooks();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public void addBook(Book book) throws  SSException{
        try {
            bookMapper.addBooks(book);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
