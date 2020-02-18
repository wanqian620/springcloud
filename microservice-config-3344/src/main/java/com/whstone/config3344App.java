package com.whstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class config3344App {

    public static void main(String[] args) {
        SpringApplication.run(config3344App.class, args);
    }
}
