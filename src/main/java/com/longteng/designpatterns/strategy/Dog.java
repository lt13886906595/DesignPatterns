package com.longteng.designpatterns.strategy;

/**
 * @className: Dog
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 **/
public class Dog implements Animal {
    public String getName(){
       return "我是狗";
    }

    @Override
    public void run() {
        System.out.println("狗跑步");
    }

    @Override
    public void swimming() {
        System.out.println("狗游泳");
    }
}
