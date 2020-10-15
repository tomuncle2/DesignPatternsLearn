package com.caidi.design.create.factory;

/**
 * @author: 蔡迪
 * @date: 10:35 2020/10/15
 * @description: 飞机
 */
public class Plane implements Moveable{
    public void go() {
        System.out.println(this.getClass().getName() + " go.....");
    }
}