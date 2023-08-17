package com.atguigu.adminboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.sql.DataSource;

@ServletComponentScan(basePackages = "com.atguigu.adminboot")
@SpringBootApplication
@MapperScan("com.atguigu.adminboot.mapper")
public class Springboot05WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot05WebAdminApplication.class, args);

    }

}
