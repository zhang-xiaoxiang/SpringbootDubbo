package com.hiram.dubbo.api.service;
/**
 * DemoService:服务接口暴露
 * @author zhangxiaoxiang
 * @date 2019/8/13
 */

public interface DemoService {
    /**
     * 传入姓名,返回字符串
     * @param name
     * @return
     */
     String sayHello(String name);
}
