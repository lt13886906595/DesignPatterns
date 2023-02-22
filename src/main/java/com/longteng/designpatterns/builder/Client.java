package com.longteng.designpatterns.builder;

/**
 * @className: Client
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 **/
public class Client {
    public static void main(String[] args) {
        Car builer = new Car.Builer().lunzi("a").fangxiangpan("a").builer();
        System.out.println(builer);
    }
}
