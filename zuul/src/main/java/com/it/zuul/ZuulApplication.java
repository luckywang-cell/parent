package com.it.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
* @EnableZuulProxy: 开启 zuul 功能
* @EnableEurekaClient: 表示自己可以作为一个服务
* @Author: Mr.Wang
* @Date: 2019/9/26
*/
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

}
