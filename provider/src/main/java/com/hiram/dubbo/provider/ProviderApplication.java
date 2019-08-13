package com.hiram.dubbo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * ProviderApplication:服务提供者
 * @author zhangxiaoxiang
 * @date 2019/8/13
 */

@EnableDubbo
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
        System.out.println("参考链接    https://blog.csdn.net/qq_29102545/article/details/87368620");
        System.out.println("参考项目地址 https://github.com/HiramJoyce/SpringbootDubbo");
        System.out.println("测试接口    http://127.0.0.1:9999/say/zhangsan");
    }

}

