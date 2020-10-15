package com.caidi.design.create.factory;

/**
 * @author: 蔡迪
 * @date: 13:43 2020/10/15
 * @description: 工厂方法模式
 */
public class PlaneFactory {
    // 设计模式 设计模式
    public Moveable create() {
        return new Plane();
    }
}