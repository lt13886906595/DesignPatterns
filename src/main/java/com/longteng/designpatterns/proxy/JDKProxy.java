package com.longteng.designpatterns.proxy;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @className: JDKProxy
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 **/
@RestController
public class JDKProxy {
    @Autowired
    private TestService testService2;

    @RequestMapping("/test2")
    public String test() throws InterruptedException {
        //获取代理类
        TestService testService = (TestService)Proxy.newProxyInstance(TestService.class.getClassLoader(), TestServiceImpl.class.getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("开始--------"+method.getName());
            return method.invoke(testService2, args);
        });
        return testService.query();
    }
}
