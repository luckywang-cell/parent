package com.it.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangXiang
 * @Description:
 * @Date: 2019/9/25 17:44
 */
@RestController
public class IndexController {
    @Value("${server.port}")
    String port;
    /**
    * @Param: [name]
    * @return: java.lang.String
    * @Description: 
    * @Author: Mr.Wang
    * @Date: 2019/9/25
    */
    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String home(@PathVariable("name")String name) {
        return "hi "+name+", I am from port:"+port;
    }
}
