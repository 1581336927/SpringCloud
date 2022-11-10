package com.hcy.springcloud7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientPayment {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientPayment.class,args);
    }
}
