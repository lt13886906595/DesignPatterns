package com.longteng.designpatterns.proxy;

import org.springframework.stereotype.Service;

/**
 * @className: TestServiceImpl
 * @description: 类描述
 * @author: lt
 * @date: 2023/2/22
 **/
@Service
public class TestServiceImpl implements TestService{
    @Override
    public String query() {
        return "ok";
    }
}
