package com.longteng.designpatterns.factory.abstractfactory;

/**
 * @className: ChinaFlower
 * @description: 具体产品
 * @author: lt
 * @date: 2023/2/22
 **/
public class ChinaFlower extends Flower {

    @Override
    public String getName(){
        return "我是中国花";
    }
}
