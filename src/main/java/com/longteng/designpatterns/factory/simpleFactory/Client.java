package com.longteng.designpatterns.factory.simpleFactory;

/**
 * @className: Client
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 **/
public class Client {
    public static void main(String[] args) {
        Flower flower = SimpleFactory.getFlower("japen");
        System.out.println(flower.getName());
    }
}
