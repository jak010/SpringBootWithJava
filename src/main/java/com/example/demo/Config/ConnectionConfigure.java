package com.example.demo.Config;

import com.example.demo.InterCeptor.ConnectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConnectionConfigure implements WebMvcConfigurer {

    @Autowired
    ConnectInterceptor connectInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(connectInterceptor);
    }
}
