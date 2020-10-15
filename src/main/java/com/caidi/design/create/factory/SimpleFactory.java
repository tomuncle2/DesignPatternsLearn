package main.java.factory;

/**
 * @author: 蔡迪
 * @date: 11:22 2020/10/15
 * @description: 简单工厂的可扩展性不好，所有产品他都要生产，任务过重
 */
public class SimpleFactory {
    public Car createCar() {
        System.out.println("");
        return new Car();
    }

    public Plane createPlane() {
        return new Plane();
    }

//    public Plane createPlane() {
//        return new Plane();
//    }
}