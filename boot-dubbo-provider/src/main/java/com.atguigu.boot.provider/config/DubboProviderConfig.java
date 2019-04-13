package com.atguigu.boot.provider.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * dubbo提供者配置类
 * Created by shuyan.qi on 2019/4/12.
 */
@Configuration
public class DubboProviderConfig {

    //dubbo应用配置
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-dubbo-provider");
        return applicationConfig;
    }

    //dubbo注册中心配置
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("localhost:2181");
        //不使用注册中心
        //registryConfig.setAddress("N/A");
        return registryConfig;
    }

    //dubbo通信协议配置
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        //测试集群
        //protocolConfig.setPort(20881);
        //protocolConfig.setPort(20882);
        protocolConfig.setPort(20883);
        return protocolConfig;
    }



    /**
     * 还可以通过@Service注解去注册服务
     * @param userService
     * @return
     */
    //dubbo服务配置
   /* @Bean
    public ServiceConfig<UserService> userServiceConfig(UserService userService){
        ServiceConfig<UserService> userServiceConfig = new ServiceConfig<>();
        //指定应用
        userServiceConfig.setApplication(applicationConfig());
        //指定注册中心
        userServiceConfig.setRegistry(registryConfig());
        //指定通信协议
        userServiceConfig.setProtocol(protocolConfig());
        userServiceConfig.setInterface(UserService.class);
        userServiceConfig.setRef(userService);
        userServiceConfig.setVersion("1.0.0");

        //方法配置
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUsers");
        methodConfig.setTimeout(5000);
        methodConfig.setRetries(2);

        List<MethodConfig> methods = new ArrayList<>(1);
        methods.add(methodConfig);
        userServiceConfig.setMethods(methods);
        userServiceConfig.export();//该方法需要调用，否则注册不上服务
        return userServiceConfig;
    }*/

}
