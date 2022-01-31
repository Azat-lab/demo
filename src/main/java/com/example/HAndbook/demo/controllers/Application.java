package com.example.HAndbook.demo.controllers;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages={"com.example.HAndbook.demo", "com.example.HAndbook.demo.repository"})
@ComponentScan(basePackages = {"com.example.HAndbook.demo", "com.example.HAndbook.demo.repository"})
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
