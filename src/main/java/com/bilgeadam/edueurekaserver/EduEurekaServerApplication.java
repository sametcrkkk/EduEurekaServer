package com.bilgeadam.edueurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EduEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduEurekaServerApplication.class, args);
    }

}
