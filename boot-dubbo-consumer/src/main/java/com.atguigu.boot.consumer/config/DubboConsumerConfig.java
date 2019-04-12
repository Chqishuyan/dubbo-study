package com.atguigu.boot.consumer.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.atguigu.boot.api.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * dubbo消费者配置类
 * Created by shuyan.qi on 2019/4/12.
 */
@Configuration
public class DubboConsumerConfig {

    //dubbo应用配置
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-dubbo-consumer");
        return applicationConfig;
    }

    //dubbo注册中心配置
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        //registryConfig.setAddress("zookeeper://localhost:2181");
        //不使用注册中心
        registryConfig.setAddress("N/A");
        return registryConfig;
    }

    //dubbo消费服务配置
    /**
     * 可以使用注解@Reference代替
     */
   /* @Bean
    public ReferenceConfig<UserService> referenceConfig(){
        ReferenceConfig<UserService> userServiceReferenceConfig = new ReferenceConfig<>();
        userServiceReferenceConfig.setApplication(applicationConfig());
        userServiceReferenceConfig.setRegistry(registryConfig());
        userServiceReferenceConfig.setInterface("com.atguigu.boot.api.UserService");
        return userServiceReferenceConfig;
    }

    @Bean
    public UserService userService(){
        return referenceConfig().get();
    }*/
}
