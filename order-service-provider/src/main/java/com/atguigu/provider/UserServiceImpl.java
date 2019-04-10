package com.atguigu.provider;

import com.atguigu.api.UserService;
import com.atguigu.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shuyan.qi on 2019/4/9.
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<User> users() {
        List<User> users = new ArrayList<User>(2);
        users.add(new User("qishuyan    ",0,18,"18349563345","安徽"));
        users.add(new User("wangbdan    ",1,16,"18349563353","安徽"));
        return users;
    }
}
