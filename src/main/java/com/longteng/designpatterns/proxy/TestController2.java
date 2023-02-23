package com.longteng.designpatterns.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: TestProxy
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 **/
@RestController
public class TestController2 {

    @Autowired
    private TestService testService;

    /**
     * for循环存在多线程并发问题
     * @return
     * @throws InterruptedException
     */
    @RequestMapping("/test1")
    public  String test() {
            synchronized (TestController2.class){
                for (int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"--"+i);
                }
            }
        //return testService.query();
        return null;
    }
}
