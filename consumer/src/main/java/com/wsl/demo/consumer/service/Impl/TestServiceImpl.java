package com.wsl.demo.consumer.service.Impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wsl.demo.consumer.service.TestService;
import com.wsl.dubbo.bean.User;
import com.wsl.dubbo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/18 0018
 * 用途：
 * 描述:
 */
@Service
public class TestServiceImpl implements TestService {
    @Reference(version = "2.0.0")
    UserService userService;
    @Override
    public User test() {
        return userService.getUser();
    }
}
