package com.hwh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.hwh.dao")
public class Application {

	public static void main(String[] args) {  
        SpringApplication.run(Application.class, args);  
  }  
}
