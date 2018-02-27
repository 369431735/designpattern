package com.prototype;
/**
 * 步骤 2 创建扩展了上面抽象类的实体类
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
