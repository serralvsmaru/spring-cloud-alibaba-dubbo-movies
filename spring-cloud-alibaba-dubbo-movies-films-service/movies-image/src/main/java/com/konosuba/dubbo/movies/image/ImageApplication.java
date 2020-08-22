package com.konosuba.dubbo.movies.image;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.konosuba.dubbo.movies.image.mapper")
@EnableDiscoveryClient
public class ImageApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImageApplication.class,args);
    }
}
