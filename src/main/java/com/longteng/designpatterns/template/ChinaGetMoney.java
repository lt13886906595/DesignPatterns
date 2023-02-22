package com.longteng.designpatterns.template;

/**
 * @className: ChinaGetMoney
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 **/
public class ChinaGetMoney  extends  GetMoney{
    @Override
    public void DoCar() {
        System.out.println("做高铁");
    }
}
