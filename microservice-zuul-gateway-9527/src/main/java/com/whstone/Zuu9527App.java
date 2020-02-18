package com.whstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuu9527App {

    public static void main(String[] args) {
        SpringApplication.run(Zuu9527App.class, args);
    }
}
