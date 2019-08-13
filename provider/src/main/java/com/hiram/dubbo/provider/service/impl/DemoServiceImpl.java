package com.hiram.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hiram.dubbo.api.service.DemoService;
/**
 * DemoServiceImpl:服务实现层
 *
 * @author zhangxiaoxiang
 * @date 2019/8/13
 */
//注意这是dubbo的service注解
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", I'm provider!";
    }
}
