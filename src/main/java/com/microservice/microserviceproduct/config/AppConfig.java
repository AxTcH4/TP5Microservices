package com.microservice.microserviceproduct.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.microservice.microserviceproduct")
public class AppConfig {
    // Cette classe centralise le balayage des composants Spring
}
