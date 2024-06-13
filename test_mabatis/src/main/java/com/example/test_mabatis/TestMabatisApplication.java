package com.example.test_mabatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.test_mabatis.mapper")
public class TestMabatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMabatisApplication.class, args);

    }

}
