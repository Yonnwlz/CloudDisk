package com.lz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lz.dao")
public class LzDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzDaoApplication.class, args);
    }

}
