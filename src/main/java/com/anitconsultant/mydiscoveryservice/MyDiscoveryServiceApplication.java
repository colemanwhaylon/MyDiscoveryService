package com.anitconsultant.mydiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MyDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDiscoveryServiceApplication.class, args);
    }

}
