package com.longteng.designpatterns.factory.factoryMethod;

/**
 * @className: FlowerStore
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 **/
public class FlowerStore {

    private FlowerFactory flowerFactory;

    public FlowerStore(FlowerFactory flowerFactory) {
        this.flowerFactory = flowerFactory;
    }

    public Flower OrderFlower(){
        return flowerFactory.createFlower();
    }
}
