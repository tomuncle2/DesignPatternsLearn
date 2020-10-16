package com.caidi.design.create;

import com.caidi.design.create.abstractfactory.AbstractFactory;
import com.caidi.design.create.abstractfactory.Food;
import com.caidi.design.create.abstractfactory.Vehicle;
import com.caidi.design.create.abstractfactory.Weapon;
import com.caidi.design.create.abstractfactory.tworace.Broom;
import com.caidi.design.create.abstractfactory.tworace.MagicStick;
import com.caidi.design.create.abstractfactory.tworace.MushRoom;

/**
 * @author: 蔡迪
 * @date: 15:15 2020/10/16
 * @description: 魔法工厂
 */
public class MagicFactory extends AbstractFactory {

    @Override
    public Food createFood() {
        return new MushRoom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }
}