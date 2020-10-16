package com.caidi.design.create;

import com.caidi.design.create.abstractfactory.AbstractFactory;
import com.caidi.design.create.abstractfactory.Food;
import com.caidi.design.create.abstractfactory.Vehicle;
import com.caidi.design.create.abstractfactory.Weapon;
import com.caidi.design.create.abstractfactory.onerace.Ak47;
import com.caidi.design.create.abstractfactory.onerace.Bread;
import com.caidi.design.create.abstractfactory.onerace.Car;

/**
 * @author: 蔡迪
 * @date: 15:15 2020/10/16
 * @description: 麻瓜工厂
 */
public class HumanFactory extends AbstractFactory {

    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Weapon createWeapon() {
        return new Ak47();
    }

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}