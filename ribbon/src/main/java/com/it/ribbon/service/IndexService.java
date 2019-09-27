package com.it.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: WangXiang
 * @Description:
 * @Date: 2019/9/25 18:42
 */
@Service
public class IndexService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "obtainFailure")
    public String home(String name) {
        //  调用其他微服务接口，访问SERVICE-CLIENT服务器的 /hi 接口
        return restTemplate.getForObject("http://SERVICE-CLIENT/hi/"+name, String.class);
    }
    /**
    * @Param: [name]
    * @return: java.lang.String
    * @Description: 当出现熔断后返回的固定参数
    * @Author: Mr.Wang
    * @Date: 2019/9/26
    */
    public String obtainFailure(String name) {
        return "sorry "+ name + " , server internal error.";
    }
}
