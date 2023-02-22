package com.longteng.designpatterns.factory.abstractfactory;

/**
 * @className: Flower
 * @description: 抽象产品
 * @author: lt
 * @date: 2023/2/22
 **/
public abstract class Flower {

    public abstract String getName();

    public String sing(){
        return "sing";
    }

}
