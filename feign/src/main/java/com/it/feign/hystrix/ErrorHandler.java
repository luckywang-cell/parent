package com.it.feign.hystrix;

import com.it.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: WangXiang
 * @Description:
 * @Date: 2019/9/26 15:55
 */
@Component
public class ErrorHandler implements FeignService {
    @Value("${server.port}")
    private String port;

    @Override
    public String home(String name) {
        return "sorry "+name+", port "+port;
    }
}
