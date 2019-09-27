package com.it.feign.service;

import com.it.feign.hystrix.ErrorHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: WangXiang
 * @Description:
 * @Date: 2019/9/26 10:45
 */
@FeignClient(value = "service-client", fallback = ErrorHandler.class)
public interface FeignService {
    /**
     * @Param: [name]
     * @return: java.lang.String
     * @Description:
     * @Author: Mr.Wang
     * @Date: 2019/9/26
     */
    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String home(@PathVariable("name")String name);

}