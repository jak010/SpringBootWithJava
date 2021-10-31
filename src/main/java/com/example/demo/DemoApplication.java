//package com.example.demo;
//
//import com.example.demo.model.UserEntity;
//import com.example.demo.model.UserRole;
//import com.example.demo.repostiory.UserRepository;
//import com.example.demo.service.SchoolService;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.thymeleaf.context.IContext;
//
//import java.util.Arrays;
//
//@SpringBootApplication
//public class DemoApplication {
//
//    public static void main(String[] args) {
//        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
//
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//
////        Spring Boot Bean Context Check
////        for (String beanName : beanNames) {
////            System.out.println(beanName);
////        }
//
////        UserRepository userRepository = ctx.getBean(UserRepository.class);
////        userRepository.save(new UserEntity("윤사장", 60, UserRole.ADMIN));
////
////        UserEntity user = userRepository.findByUserName("윤사장");
////        System.out.println("나이: " + user.getAge() + "," + "이름: " + user.getUserName() + " 생성일 :" + user.getCreatedAt());
//
//        SchoolService schoolService = ctx.getBean(SchoolService.class);
//        schoolService.findStudentInfo();
//
//    }
//
//}
