package com.hiram.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hiram.dubbo.api.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoController:服务消费者
 * @author zhangxiaoxiang
 * @date 2019/8/13
 */

@RestController
public class DemoController {
    /**
     * dubbo的依赖注入
     */
    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    /**
     * rest接口
     * @param name
     * @return
     */
    @GetMapping("/say/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return demoService.sayHello(name);
    }
}
