package com.longteng.designpatterns.factory.abstractfactory;

import com.longteng.designpatterns.factory.factoryMethod.ChinaFlower;
import com.longteng.designpatterns.factory.factoryMethod.Flower;

/**
 * @className: ChinaFactory
 * @description: 中国工厂相当于产品族---具体工厂
 * @author: lt
 * @date: 2023/2/22
 **/
public class ChinaFactory implements FlowerFactory{
    @Override
    public Flower createFlower() {
        return new ChinaFlower();
    }

    @Override
    public Car washCar() {
        return new ChinaCar();
    }
}
