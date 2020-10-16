package com.caidi.design.create.abstractfactory;

/**
 * @author: 蔡迪
 * @date: 17:30 2020/10/15
 * @description: 抽象产品，抽象工厂
 */
public abstract class AbstractFactory {

//   public AbstractFactory() {}
   // 创建食物
    public abstract Food createFood();
   // 创建武器
   public abstract Weapon createWeapon();

   // 创建交通工具
   public abstract Vehicle createVehicle();
}