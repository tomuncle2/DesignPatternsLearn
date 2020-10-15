package main.java.factory;

/**
 * @author: 蔡迪
 * @date: 10:32 2020/10/15
 * @description:
 */
public class Car implements Moveable{

    public void go() {
        System.out.println(this.getClass().getName() + " go.....");
    }
}