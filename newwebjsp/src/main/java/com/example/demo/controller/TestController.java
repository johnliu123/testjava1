package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/test")
@Controller
public class TestController {

	@RequestMapping("/hello")
    public String index(){
		
		log.info("test");
		
        return "index";
    }
	
	@RequestMapping("/hello1")
    public String newIndex(){
		
		log.info("test1");
		
        return "newIndex";
    }
	
}
