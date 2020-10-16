package com.caidi.design.create.abstractfactory;

import com.caidi.design.create.HumanFactory;
import com.caidi.design.create.MagicFactory;

/**
 * @author: 蔡迪
 * @date: 16:16 2020/10/15
 * @description:
 */
public class Main {
    //
    public static void main(String[] args) {
//        Car car = new Car();
//        Ak47 ak47 = new Ak47();
//        Bread bread = new Bread();
//
//        car.go();
//        ak47.shot();
//        bread.eat();

        // 抽象工厂模式
        AbstractFactory abstractFactory = new MagicFactory();
        abstractFactory.createFood().eat();
        abstractFactory.createVehicle().go();
        abstractFactory.createWeapon().shot();

        // 人类工厂
        AbstractFactory humanAbstractFactory = new HumanFactory();
        humanAbstractFactory.createFood().eat();
        humanAbstractFactory.createVehicle().go();
        humanAbstractFactory.createWeapon().shot();

    }
}