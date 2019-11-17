package com.funtl.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IDEA
 * Description:
 * Author:大钉子i
 * Date:2019/11/17
 * Time:下午8:37
 */
@EnableConfigServer //
@EnableEurekaClient  //client 服务提供者，server 服务消费者
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }
}
