package com.whstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.whstone"})
public class DeptConsumer80FeignApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80FeignApp.class, args);
    }
}
