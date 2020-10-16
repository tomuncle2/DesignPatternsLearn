package com.caidi.design.create.abstractfactory.onerace;


import com.caidi.design.create.abstractfactory.Vehicle;

/**
 * @author: 蔡迪
 * @date: 17:17 2020/10/15
 * @description: car
 */
public class Car extends Vehicle {
    @Override
    public void go() {
        System.out.println(this.getClass().getName() + " go go go....");
    }
}