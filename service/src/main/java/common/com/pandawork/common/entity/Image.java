package com.pandawork.common.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Table(name = "t_images")
@Entity
public class Image {
    @Id
    private int id;

    @Column(name = "user")
    private String user;
    @Column(name = "image")
    private String image;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
