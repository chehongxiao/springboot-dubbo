package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:8062/sayHello?content=123
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String content){
        return userService.sayHello(content);
    }
}
