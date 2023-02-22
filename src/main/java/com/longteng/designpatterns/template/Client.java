package com.longteng.designpatterns.template;

/**
 * @className: Client
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 **/
public class Client{
    public static void main(String[] args) {
        //ChinaGetMoney chinaGetMoney = new ChinaGetMoney();
        //chinaGetMoney.getMoney();
        JapenGetMoney japenGetMoney = new JapenGetMoney();
        japenGetMoney.getMoney();

    }
}
