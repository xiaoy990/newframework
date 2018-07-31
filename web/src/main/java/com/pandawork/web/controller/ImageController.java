package com.pandawork.web.controller;

import com.pandawork.common.entity.Image;
import com.pandawork.service.ImageService;
import com.pandawork.web.spring.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
@RequestMapping("/image")
public class ImageController extends AbstractController {

    @RequestMapping("/addimg")
    public String addImage(Image image, HttpSession session, MultipartFile uploadFile, Model model){
        String filename = uploadFile.getOriginalFilename();
        //将文件
        String leftPath = session.getServletContext().getRealPath("images");
        File file = new File(leftPath,filename);
        image.setImage("/images/"+filename);
        try {
            uploadFile.transferTo(file);
        }
        catch (Exception e){
            System.out.println("文件保存出错");
            e.printStackTrace();
        }
        imageService.addImages(image);
        model.addAttribute("image",image);
        return "success";
    }
}
