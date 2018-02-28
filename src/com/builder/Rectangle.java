package com.builder;

public class Rectangle {
    int width;
    int  heigth;

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }
    public int getArea(){
        return this.heigth*this.width;
    }
}
