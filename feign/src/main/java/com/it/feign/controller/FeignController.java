package com.it.feign.controller;

import com.it.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangXiang
 * @Description:
 * @Date: 2019/9/26 10:52
 */
@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;
    /**
     * @Param: [name]
     * @return: java.lang.String
     * @Description:
     * @Author: Mr.Wang
     * @Date: 2019/9/26
     */
    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String home(@PathVariable("name")String name) {
        return feignService.home(name);
    }
}