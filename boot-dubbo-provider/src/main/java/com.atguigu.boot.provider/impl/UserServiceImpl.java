package com.atguigu.boot.provider.impl;

import com.atguigu.boot.api.UserService;
import com.atguigu.boot.bean.User;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shuyan.qi on 2019/4/12.
 */
//@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<User>(2);
        users.add(new User("qishuyan    ",0,18,"18349563345","安徽"));
        users.add(new User("wangbdan    ",1,16,"18349563353","安徽"));
        return users;
    }
}
