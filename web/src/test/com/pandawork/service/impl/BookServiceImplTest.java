package impl;

import com.pandawork.common.entity.Book;
import com.pandawork.mapper.BookMapper;
import com.pandawork.service.BookService;
import com.pandawork.service.impl.BookServiceImpl;
import com.pandawork.test.AbstractTestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@Component
public class BookServiceImplTest extends AbstractTestCase {
    @Autowired
    BookService bookService;
//    BookService bookService = new BookServiceImpl();

    @Test
    public void searchBook() throws Exception{
        System.out.println(bookService.searchBook("1"));
    }

    @Test
    public void listAllTest() throws Exception{
        System.out.println(bookService.listAllBooks());
    }

//    @Test
//    public void test() {
//        InputStream in = null;
//        List<Book> list = null;
//        //加载Mybatis配置文件
//        try {
//            in = Resources.getResourceAsStream("testmybatis.xml");
//            //根据相关的mybatis配置文件， 创建连接SQLSessionFactory连接对象
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//            //创建出SQLSession对象
//            SqlSession sqlSeesion = factory.openSession();
//            //通过sqlSession取到映射接口
//            BookMapper bookMapper = sqlSeesion.getMapper(BookMapper.class);
//            try {
//                list = bookMapper.listAllBooks();
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//            System.out.println(list);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
