package com.nowcoder.community2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Community2Application {

    @PostConstruct
    public void init(){
        // 解决 netty 启动冲突的问题（redis 和 elastic search 都依赖 netty）
        // 关键代码在 Netty4Utils
        System.setProperty("es.set.netty.runtime.available.processors","false");
    }

    public static void main(String[] args) {
        SpringApplication.run(Community2Application.class, args);
    }

}
