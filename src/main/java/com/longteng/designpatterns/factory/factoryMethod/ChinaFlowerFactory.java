package com.longteng.designpatterns.factory.factoryMethod;

/**
 * @className: ChinaFlowerFactory
 * @description: 具体抽象工厂
 * @author: lt
 * @date: 2023/2/22
 **/
public class ChinaFlowerFactory implements FlowerFactory {
    @Override
    public Flower createFlower() {
        return new ChinaFlower();
    }
}
