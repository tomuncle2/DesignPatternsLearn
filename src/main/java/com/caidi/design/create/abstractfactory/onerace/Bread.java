package com.caidi.design.create.abstractfactory.onerace;


import com.caidi.design.create.abstractfactory.Food;

/**
 * @author: 蔡迪
 * @date: 17:24 2020/10/15
 * @description: 面包
 */
public class Bread extends Food {

    @Override
    public void eat() {
        System.out.println(this.getClass().getName() + " 被吃....");
    }
}