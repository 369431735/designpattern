package com.abstractFactory;
/***
 * 步骤4 创建实现颜色接口的实体类。
 */
public class Green  implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
