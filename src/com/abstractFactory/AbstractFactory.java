package com.abstractFactory;

/**
 * 步骤 5 为 Color 和 Shape 对象创建抽象类来获取工厂。
 */
public abstract class AbstractFactory {
    abstract Color getColor(Class clazz);
    abstract Shape getShape(Class clazz) ;
}
