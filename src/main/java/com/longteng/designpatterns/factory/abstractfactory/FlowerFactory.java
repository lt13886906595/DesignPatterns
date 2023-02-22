package com.longteng.designpatterns.factory.abstractfactory;

import com.longteng.designpatterns.factory.factoryMethod.Flower;

/**
 * @className: FlowerFactory
 * @description: 抽象工厂
 * @author: lt
 * @date: 2023/2/22
 **/
public interface FlowerFactory {
    Flower createFlower();
    Car    washCar();
}
