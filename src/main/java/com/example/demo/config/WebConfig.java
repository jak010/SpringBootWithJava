package com.example.demo.config;


import com.example.demo.interceptor.ExecuteTimeInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.resource.VersionResourceResolver;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Bean
    public ExecuteTimeInterceptor executeTimeInterceptor() {
        return new ExecuteTimeInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(executeTimeInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }


    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/assets/**")
                .addResourceLocations("classpath:/assets/", "/assets/")
                .setCachePeriod(60 * 60 * 24 * 365)
                .resourceChain(true)
                .addResolver(new VersionResourceResolver().addContentVersionStrategy("/**"));

        registry.addResourceHandler("/templates/**")
                .addResourceLocations("classpath:/templates/", "/templates/");
    }
}
