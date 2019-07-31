package com.shaoyu.mysite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shaoyu.mysite.dao")
public class MysiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysiteApplication.class, args);
    }

}
