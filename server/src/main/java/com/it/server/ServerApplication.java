package com.it.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
* @SpringBootApplication: 表明这是一个SpringBoot启动的入口
* @EnableEurekaServer: 表明这是一个注册中心
* @Description:
* @Author: Mr.Wang
* @Date: 2019/9/25
*/
@EnableEurekaServer
@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}
