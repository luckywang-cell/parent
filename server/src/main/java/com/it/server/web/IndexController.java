package com.it.server.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangXiang
 * @Description:
 * @Date: 2019/9/25 16:57
 */
@EnableEurekaClient
@RestController
public class IndexController {
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hi/{name}")
    public String hi(@PathVariable("name") String name) {
        return "hi " + name + " , I am " + port + " port";
    }
}
