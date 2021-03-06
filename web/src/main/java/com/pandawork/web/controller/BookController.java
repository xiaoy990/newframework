package com.pandawork.web.controller;


import com.pandawork.common.entity.Book;
import com.pandawork.service.BookService;
import com.pandawork.web.spring.AbstractController;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("/Book")
public class BookController extends AbstractController {
    @Autowired
    BookService bookService;

    @RequestMapping(value = "/testfile", method = RequestMethod.POST)
    public String testFile(MultipartFile uploadFile, HttpSession session,String pub) throws Exception{
        //获取文件名作为保存到服务器的名称
        String filename = uploadFile.getOriginalFilename();
        String leftpath = session.getServletContext().getRealPath("images");
        //路径拼接
        File file = new File(leftpath,filename);
        System.out.println(file);
        uploadFile.transferTo(file);
        return "main";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchBook(String sname,Model model){
        try{
            model.addAttribute("list",bookService.searchBook(sname));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "search";
    }

    @RequestMapping(value = "/toupdate", method = RequestMethod.GET)
    public String toupdate(){
        return "update";
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String doUptade(Book book){
        try{
            bookService.update(book);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/Book/ListAll";
    }

    @RequestMapping(value = "/del" , method = RequestMethod.GET)
    public String delBook(int id){
        try{
            bookService.del(id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/Book/ListAll";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String newBook(Book book){
        try{
            bookService.addBook(book);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/Book/ListAll";
    }

    @RequestMapping(value = "/toadd", method = RequestMethod.GET)
    public String addBooks(Book book,Model model){
        return "add";
    }

    @RequestMapping(value = "/ListAll", method = RequestMethod.GET)
    public String listAllBooks(Model model){
        List<Book> list = null;
        try{
            list = bookService.listAllBooks();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("list",list);
        return "main";
    }
}
