package com.hsy.springcloud.producer.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path springboot.demo/com.hsy.springboot.demo.springboot.jdbc
 * @date ${data} ${time}
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@EnableDiscoveryClient
//激活Eureka中的DiscoveryClient实现，（自动化配置，创建DiscoveryClient，针对服务注册中i性能的EnableEurekaServer）
@SpringBootApplication
public class SpringCloudProducerRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProducerRestApplication.class,args) ;
    }
}
