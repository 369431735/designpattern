package com.abstractFactory;

/**
 * 步骤 8
 使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象。
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        //获取形状工厂
        AbstractFactory shapeFactory = (AbstractFactory)FactoryProducer.getFactory(ShapeFactory.class);

        //获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape(Circle.class);

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape(Rectangle.class);

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape(Square.class);

        //调用 Square 的 draw 方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory =(AbstractFactory) FactoryProducer.getFactory(ColorFactory.class);

        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor(Red.class);

        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor(Green.class);

        //调用 Green 的 fill 方法
        color2.fill();

        //获取颜色为 Blue 的对象
        Color color3 = colorFactory.getColor(Blue.class);

        //调用 Blue 的 fill 方法
        color3.fill();
    }
}