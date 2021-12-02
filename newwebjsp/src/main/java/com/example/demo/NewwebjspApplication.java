package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class NewwebjspApplication extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(NewwebjspApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(NewwebjspApplication.class, args);
	}

	@RequestMapping("/test")
    public String test(){
		
		
		return "test";
		
    }
}
