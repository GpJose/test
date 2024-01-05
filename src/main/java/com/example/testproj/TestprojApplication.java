package com.example.testproj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.example.testproj")

public class TestprojApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestprojApplication.class, args);
    }

}
