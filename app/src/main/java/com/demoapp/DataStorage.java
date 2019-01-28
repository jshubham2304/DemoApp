package com.demoapp;

import android.graphics.drawable.Drawable;

public class DataStorage {
    int i;
    int title;
    int description;
    int image1;
    int image2;

    public DataStorage(int i, int title, int description, int image1, int image2) {
        this.i = i;
        this.title = title;
        this.description = description;
        this.image1 = image1;
        this.image2 = image2;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }
}
