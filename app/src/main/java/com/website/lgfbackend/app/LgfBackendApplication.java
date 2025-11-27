package com.website.lgfbackend.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.website.lgfbackend")
public class LgfBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(LgfBackendApplication.class, args);
    }

}
