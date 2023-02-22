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

    @RequestMapping("/test1")
    public String test() throws InterruptedException {
        return testService.query();
    }
}
