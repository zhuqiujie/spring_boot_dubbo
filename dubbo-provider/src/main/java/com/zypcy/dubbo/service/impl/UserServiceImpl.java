package com.zypcy.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zypcy.dubbo.service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    public String sayHello(String name) {
        return "Hello, " + name + " from Dubbo Spring Boot ";
    }
}
