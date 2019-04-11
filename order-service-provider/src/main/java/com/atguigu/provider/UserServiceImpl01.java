package com.atguigu.provider;

import com.atguigu.api.UserService;
import com.atguigu.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shuyan.qi on 2019/4/9.
 */
public class UserServiceImpl01 implements UserService {

    @Override
    public List<User> users() {
        System.out.println("UserServiceImpl01...old");
        List<User> users = new ArrayList<User>(2);
        users.add(new User("qishuyan    ",0,18,"18349563345","安徽"));
        users.add(new User("wangbdan    ",1,16,"18349563353","安徽"));
        try {
            Thread.sleep(3000);//测试dubbo超时配置
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return users;
    }
}
