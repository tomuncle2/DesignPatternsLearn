package com.caidi.design.create.builder;

/**
 * @author: 蔡迪
 * @date: 10:27 2020/10/16
 * @description: builder
 * 构建模式 构造复杂对象 有的类成员没有必要显示指定值，
 * 符合链式调用
 */
public class Person {
    // 名称
    private String name;
    // 年龄
    private Integer age;
    // 身份证
    private Integer id;
    // 体重
    private double weight;
    // 分数
    private int score;
    // 地址
    private Location location;

    private Person () {}
    // 构造器
    static class PersonBuilder {
        Person person = new Person();

        // 构造基本信息
        PersonBuilder buildBaseinfo(String name, Integer id, Integer age) {
            person.name = name;
            person.id = id;
            person.age = age;
            return this;
        }

        // 构造身体
        PersonBuilder buildWeight(double weight, int score) {
            person.weight = weight;
            person.score = score;
            return this;
        }

        // 构造地址
        PersonBuilder buildLocation(String province, String address) {
//            person.location.province = province;
//            person.location.address = address;
            person.location = new Location(province, address);
            return this;
        }

        Person buildPerson() {
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", weight=" + weight +
                ", score=" + score +
                ", location=" + location +
                '}';
    }
}

class Location {
    // 地址
     String province;
    // 地址
     String address;
    public Location(String province, String address) {
        this.address = address;
        this.province = province;
    }

    @Override
    public String toString() {
        return "Location{" +
                "province='" + province + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}