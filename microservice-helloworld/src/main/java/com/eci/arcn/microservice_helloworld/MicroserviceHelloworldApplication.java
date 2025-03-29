package com.eci.arcn.microservice_helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MicroserviceHelloworldApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceHelloworldApplication.class, args);
    }
}

@RestController
class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
