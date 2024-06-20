package com.example.demoexcelreader;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demoexcelreader.mapper")
public class DemoExcelReaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoExcelReaderApplication.class, args);
    }

}
