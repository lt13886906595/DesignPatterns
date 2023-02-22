package com.longteng.designpatterns.strategy;

/**
 * @className: AnimalFactory
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 **/
public class AnimalFactory {
    public static Animal createAnimal(Animal type){
        if(type instanceof Cat){
            return new Cat();
        }else if(type instanceof Dog){
            return new Dog();
        }
        return null;
    }
}
