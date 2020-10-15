package main.java.factory;

/**
 * @author: 蔡迪
 * @date: 11:26 2020/10/15
 * @description: 工厂方法模式
 */
public class CarFactory {

    public Moveable create() {
        return new Car();
    }
}