package com.caidi.design.xinwei;

/**
 * @author: 蔡迪
 * @date: 17:24 2020/10/14
 * @description: 模板方法
 */
public class TemplateMethod {
    public static void main(String[] args)
    {
        CosmicMan cosmicMan = new MarsMan();
        cosmicMan.show();
    }
}

// 宇宙人
abstract class CosmicMan {

    public void show() {
        eat();
        run();
    }
     //
     abstract void eat();
     //
     abstract void run();
}

// 地球人
class EarthMan extends CosmicMan{

    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " 吃 拉面");
    }

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " 开 f35");
    }
}

// 火星人
class MarsMan extends CosmicMan{

    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " 吃 土");
    }

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " 开 ufo");
    }
}