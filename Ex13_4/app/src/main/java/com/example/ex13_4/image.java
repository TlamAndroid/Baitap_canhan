package com.example.ex13_4;
public class image {
    private int img;
    private String name;

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public image(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public image() {
    }
}