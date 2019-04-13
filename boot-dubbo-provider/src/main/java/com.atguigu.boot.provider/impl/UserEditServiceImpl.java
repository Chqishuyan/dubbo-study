package com.atguigu.boot.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.boot.api.UserEditService;
import com.atguigu.boot.bean.User;

/**
 * Created by shuyan.qi on 2019/4/13.
 */
@Service(cluster = "failfast",timeout = 2000)
public class UserEditServiceImpl implements UserEditService {
    @Override
    public void add(User user) {
        System.out.println("UserEditServiceImpl add...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
