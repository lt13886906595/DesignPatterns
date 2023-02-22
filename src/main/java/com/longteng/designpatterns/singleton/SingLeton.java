package com.longteng.designpatterns.singleton;

/**
 * @className: SingLeton
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 * 作用：节约内存空间
 **/
public class SingLeton {
    private  static   SingLeton singLeton;

    private SingLeton() { }
    //线程安全
    public static synchronized  SingLeton getSingLeton() {
        if(singLeton == null){
            System.out.println(Thread.currentThread().getName());
            singLeton = new SingLeton();
        }
        return singLeton;
    }
}
