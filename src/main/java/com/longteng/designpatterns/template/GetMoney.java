package com.longteng.designpatterns.template;

/**
 * @className: GetMoney
 * @description: 取钱的过程-----------模板方法（优点控制翻转）
 * @author: lt
 * @date: 2023/2/22
 **/
public abstract class GetMoney {

    protected void getMoney(){
        DoCar();
        GoBank();
    }

    public abstract void DoCar();

    public void GoBank(){
        System.out.println("去银行");
    }
}
