package com.whstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
@MapperScan(basePackages = "com.whstone.mapper")
public class DeptProvier8001App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvier8001App.class, args);
    }
}
