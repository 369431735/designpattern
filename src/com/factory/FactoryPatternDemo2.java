package com.factory;

public class FactoryPatternDemo2 {
    public static void main(String[] args) {
        Rectangle rect = (Rectangle) ShapeFactory2.getClass(Rectangle.class);
        rect.draw();
        Square square = (Square) ShapeFactory2.getClass(Square.class);
        square.draw();
        Circle circle = (Circle) ShapeFactory2.getClass(Circle.class);
        circle.draw();
    }
}
