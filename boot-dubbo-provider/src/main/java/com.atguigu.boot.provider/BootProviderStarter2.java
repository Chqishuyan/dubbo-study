package com.atguigu.boot.provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * springBoot集成dubbo：
 *  方式1：在application配置文件中保存dubbo配置信息，使用@Service【暴露服务】，@Reference【引用服务】
 *  方式2：使用dubbo.xml的形式
 *  方式3：使用注解API：
 *              将Dubbo的配置类配置到SpringBoot中
 * Created by shuyan.qi on 2019/4/11.
 */
//@EnableDubbo
//@ImportResource("classpath:boot-dubbo-provider.xml")
@DubboComponentScan(basePackages = "com.atguigu.boot.provider")
@SpringBootApplication
public class BootProviderStarter2 {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(BootProviderStarter2.class,args);
        System.in.read();
    }
}
