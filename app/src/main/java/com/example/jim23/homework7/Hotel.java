package com.example.jim23.homework7;

import android.graphics.Bitmap;

/**
 * Created by jim23 on 2017/6/8.
 */

public class Hotel {

    private Bitmap imgUrl;
    private String name;
    private String add;

    public Bitmap getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Bitmap imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
