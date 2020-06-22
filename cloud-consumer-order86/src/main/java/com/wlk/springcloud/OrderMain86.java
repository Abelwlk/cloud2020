package com.wlk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain86 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain86.class, args);
    }
}
