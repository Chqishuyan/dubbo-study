package com.atguigu.boot.api;

import com.atguigu.boot.bean.User;

import java.util.List;

/**
 * Created by shuyan.qi on 2019/4/12.
 */
public interface UserService {
    List<User> getUsers();
}
