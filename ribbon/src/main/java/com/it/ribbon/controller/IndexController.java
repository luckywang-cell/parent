package com.it.ribbon.controller;

import com.it.ribbon.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangXiang
 * @Description:
 * @Date: 2019/9/26 9:30
 */
@RestController
public class IndexController {
    @Autowired
    private IndexService indexService;
    /**
    * @Param: [name]
    * @return: java.lang.String
    * @Description: 用来调用IndexService.home(String name);
    * @Author: Mr.Wang
    * @Date: 2019/9/26
    */
    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String home(@PathVariable("name")String name) {
        return indexService.home(name);
    }
}
