package com.example.demo.config;

import com.example.demo.Handler.VulnerableLog4JExampleHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class BasicConfiguration implements WebMvcConfigurer {

    @Autowired
    VulnerableLog4JExampleHandler vlog;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(vlog);
    }
}
