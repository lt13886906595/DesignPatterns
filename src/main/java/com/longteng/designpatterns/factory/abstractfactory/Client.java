package com.longteng.designpatterns.factory.abstractfactory;

import com.longteng.designpatterns.factory.factoryMethod.Flower;

/**
 * @className: Client
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 **/
public class Client {

    public static void main(String[] args) {
        Flower flower = new ChinaFactory().createFlower();
        System.out.println(flower.getName());
        Car car = new ChinaFactory().washCar();
        System.out.println(car.getName());

    }
}
