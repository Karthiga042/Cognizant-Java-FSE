package com.cognizant.hello_rest_api;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloRestApiApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(HelloRestApiApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
        app.run(args);
    }
}
