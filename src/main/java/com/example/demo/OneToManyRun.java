package com.example.demo;

import com.example.demo.service.SchoolService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class OneToManyRun {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(OneToManyRun.class, args);


        SchoolService schoolService = ctx.getBean(SchoolService.class);
        schoolService.findSchoolInfo();


    }
}
