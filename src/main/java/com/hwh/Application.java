package com.hwh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//定时器注解
@MapperScan("com.hwh.dao")//扫描dao层包 
public class Application {

	public static void main(String[] args) {  
        SpringApplication.run(Application.class, args);  
  }  
}
