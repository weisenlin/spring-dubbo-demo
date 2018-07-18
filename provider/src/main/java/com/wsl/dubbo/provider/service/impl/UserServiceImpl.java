package com.wsl.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wsl.dubbo.bean.User;
import com.wsl.dubbo.service.UserService;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/18 0018
 * 用途：
 * 描述:
 */
@Service(version = "2.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        return new User("1","xiaoming");
    }
}
