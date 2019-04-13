package com.atguigu.boot.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.boot.api.UserService;
import com.atguigu.boot.bean.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shuyan.qi on 2019/4/12.
 */
/**
 * Dubbo集群容错
 * 1、failover：失败自动切换，当出现失败，重试其它服务器。通常用于读操作，但重试会带来更长延迟。可通过 retries="2" 来设置重试次数(不含第一次)。（该配置为缺省配置）
 * 2、failfast：快速失败，只发起一次调用，失败立即报错。通常用于非幂等性的写操作，比如新增记录。
 * 3、failsafe：失败安全，出现异常时，直接忽略。通常用于写入审计日志等操作。
 * 4、failback：失败自动恢复，后台记录失败请求，定时重发。通常用于消息通知操作。
 * 5、forking：并行调用多个服务器，只要一个成功即返回。通常用于实时性要求较高的读操作，但需要浪费更多服务资源。可通过 forks="2" 来设置最大并行数。
 * 6、broadcast：广播调用所有提供者，逐个调用，任意一台报错则报错。通常用于通知所有提供者更新缓存或日志等本地资源信息。（2.1.0 开始支持）
 */
@Service(cluster = "failover",retries = 2,timeout = 2000)
//@Component
public class UserServiceImpl implements UserService {

   // @HystrixCommand(fallbackMethod="hello")
    @Override
    public List<User> getUsers() {
        System.out.println("method getUsers...");
        if(Math.random() > 0.5d){
            throw new RuntimeException();
        }
        List<User> users = new ArrayList<User>(2);
        users.add(new User("qishuyan    ",0,18,"18349563345","安徽"));
        users.add(new User("wangbdan    ",1,16,"18349563353","安徽"));
        return users;
    }

    public List<User> hello(){
        return Arrays.asList(new User("test",1,0,"test","test"));
    }
}
