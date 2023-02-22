package com.longteng.designpatterns.factory.simpleFactory;

/**
 * @className: SimpleFactory
 * @description: 增加产品类型，耦合度较高
 * @author: lt
 * @date: 2023/2/22
 **/
public class SimpleFactory {

    public static Flower getFlower(String type){
        if("china".equals(type)){
            return new ChinaFlower();
        }else if("japen".equals(type)){
            return new JapenFlower();
        }
        return null;
    }
}
