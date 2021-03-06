package com.konosuba.dubbo.movies.navi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.konosuba.dubbo.movies.navi.mapper")
@EnableDiscoveryClient
public class NaviApplication {
    public static void main(String[] args) {
        SpringApplication.run(NaviApplication.class, args);
    }
}
