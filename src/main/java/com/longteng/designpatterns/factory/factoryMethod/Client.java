package com.longteng.designpatterns.factory.factoryMethod;

/**
 * @className: Client
 * @description: 测试工厂方法
 * @author: lt
 * @date: 2023/2/22
 **/
public class Client {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore(new ChinaFlowerFactory());
        Flower flower = flowerStore.OrderFlower();
        System.out.println(flower.getName());
    }
}
