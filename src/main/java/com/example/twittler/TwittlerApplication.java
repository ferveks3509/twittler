package com.example.twittler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.access.SecurityConfig;

@SpringBootApplication
public class TwittlerApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TwittlerApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TwittlerApplication.class, args);
    }

}
