package com.caidi.design.create.factory;


/**
 * @author: 蔡迪
 * @date: 17:03 2020/10/14
 * @description: 形容词定义为接口 名词定义为抽象类  语义化
 * 任意定制交通工具
 * （实现Moveable接口）
 * 任意定制生产过程
 * (不同的Moveable = com.caidi.design.create.factory.create()）
 * 任意定制产品一族
 */
public class Main {
  // 设计模式
  public static void main(String[] args) {
//      // 汽车
//      Car car = new Car();
//      car.go();
//      // 飞机
//      Plane plane = new Plane();
//      plane.go();

      // 优化代码 配置文件读取对象 反射实现
      Moveable moveable = new Car();
      moveable.go();

      // 优化代码
      SimpleFactory simpleFactory = new SimpleFactory();
      simpleFactory.createCar().go();
      simpleFactory.createPlane().go();

      //
      CarFactory carFactory = new CarFactory();
      carFactory.create().go();

      //
     PlaneFactory planeFactory = new PlaneFactory();
      planeFactory.create().go();
  }
}