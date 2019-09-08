package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 *
 * @author yq
 * @Date  2019/03/10
 *
 */

@SpringBootApplication
@ServletComponentScan
public class SpringRunApp extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringRunApp.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringRunApp.class, args);
    }
}