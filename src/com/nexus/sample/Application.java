package com.nexus.sample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import java.lang.Exception;


@SuppressWarnings("deprecation")
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
//Application class to start the Spring Boot application
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    
    public static void main(String[] args) {
//        try {
            SpringApplication.run(Application.class, args);
//        } catch (Exception e) {
//        }
    }
}
