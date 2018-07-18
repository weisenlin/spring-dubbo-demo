package com.wsl.demo.consumer.controller;

import com.wsl.demo.consumer.service.TestService;
import com.wsl.dubbo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/18 0018
 * 用途：
 * 描述:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/user")
    public User getUser(){
        return testService.test();
    }
}
