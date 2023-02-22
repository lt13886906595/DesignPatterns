package com.longteng.designpatterns.strategy;

/**
 * @className: Cat
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 **/
public class Cat implements Animal {

    private String getName(){
        return "我是猫";
    }

    @Override
    public void run() {
        System.out.println("猫跑步");
    }

    @Override
    public void swimming() {
        System.out.println("猫游泳");
    }
}
