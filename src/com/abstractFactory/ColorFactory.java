package com.abstractFactory;
/***
 *步骤 6 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(Class clazz){
        return null;
    }

    @Override
    Color getColor(Class clazz) {
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return (Color)obj;
    }
}
