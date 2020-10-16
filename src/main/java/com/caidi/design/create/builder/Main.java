package com.caidi.design.create.builder;

/**
 * @author: 蔡迪
 * @date: 23:07 2020/10/15
 * @description: 构建器模式   构建复杂对象，
 * 利用构建器模式 可以选择构建对象的那几个部分 可以链式调用
 * 创建需要构建的对象的 构建器，
 * 定义构建器的 1.构建方法，其返回值为构建器本身   2.build方法 构建完成方法 返回构建的对象
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
                .build();
        System.out.println(person);
    }
}