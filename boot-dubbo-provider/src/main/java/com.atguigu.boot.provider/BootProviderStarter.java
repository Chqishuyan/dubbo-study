package com.atguigu.boot.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * springBoot集成dubbo：
 *  方式1：在application配置文件中保存dubbo配置信息，使用@Service【暴露服务】，@Reference【引用服务】
 *  方式2：使用dubbo.xml的形式
 * Created by shuyan.qi on 2019/4/11.
 */
//@EnableDubbo
@ImportResource("classpath:boot-dubbo-provider.xml")
@SpringBootApplication
public class BootProviderStarter {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(BootProviderStarter.class,args);
        System.in.read();
    }
}
