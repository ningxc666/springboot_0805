package com.example.boot;

import com.example.boot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class SpringbootInitializrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootInitializrApplication.class, args);
    }

}
