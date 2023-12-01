package com.ldkspringbase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ldkspringbase.mapper")
public class LdkSpringBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LdkSpringBaseApplication.class, args);
    }

}
