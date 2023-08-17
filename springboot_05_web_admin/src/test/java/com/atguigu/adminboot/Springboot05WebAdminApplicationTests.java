package com.atguigu.adminboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class Springboot05WebAdminApplicationTests {

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
        log.info("类型："+dataSource.getClass());
    }

}
