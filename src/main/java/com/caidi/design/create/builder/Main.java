package com.caidi.design.create.builder;

/**
 * @author: 蔡迪
 * @date: 23:07 2020/10/15
 * @description: 构建器模式
 */
public class Main {
    public static void main(String[] args) {

        // 构建堡垒
        ComplexTerrainBuilder complexTerrainBuilder = new ComplexTerrainBuilder();
        Terrain t = complexTerrainBuilder
                .buildWall()
                .buildFort()
                .buildMine()
                .build();
        System.out.println(t);

        // 构建person
        Person person =
                new Person.PersonBuilder()
                .buildBaseinfo("小张",10086,18)
                .buildLocation("重庆","重庆光电园双子座A")
                .buildPerson();
        System.out.println(person);
    }
}