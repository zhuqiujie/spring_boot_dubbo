package com.zypcy.dubbo.service;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//读取配置文件
@ImportResource({"classpath:spring-provider.xml"})
public class ProviderApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

}
