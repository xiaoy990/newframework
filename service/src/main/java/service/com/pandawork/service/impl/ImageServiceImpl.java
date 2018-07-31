package com.pandawork.service.impl;

import com.pandawork.common.entity.Image;
import com.pandawork.mapper.ImageMapper;
import com.pandawork.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("imageService")
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageMapper imageMapper;
    public void addImages (Image image){
        try {
            imageMapper.addImage(image);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
