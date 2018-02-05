package com.builder;
/***
 * 步骤 4 创建扩展了 Burger 和 ColdDrink 的实体类
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
