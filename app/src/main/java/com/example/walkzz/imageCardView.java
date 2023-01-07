package com.example.walkzz;

public class imageCardView {
    private String imgName;
    private int img;

    public imageCardView(String imgName, int img) {
        this.imgName = imgName;
        this.img = img;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}

