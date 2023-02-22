package com.longteng.designpatterns.test;

import com.longteng.designpatterns.singleton.SingLeton;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @className: TestController
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 **/
@RestController
public class TestController {


    @RequestMapping("/test")
    public String test(){
        //ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 10L,
        //        TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        //threadPoolExecutor.execute(() -> {
        //    SingLeton singLeton = SingLeton.getSingLeton();
        //    //pool-1-thread-1  SingLeton@70194713
        //    System.out.println(singLeton);
        //});
        SingLeton singLeton = SingLeton.getSingLeton();
        System.out.println(singLeton);
        return null;
    }
}
