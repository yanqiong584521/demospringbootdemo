package com.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ComponentScan(basePackages = { "com.demo" })
@SpringBootApplication
@EnableScheduling
public class SpringBootController {

	@ResponseBody
	@RequestMapping(value = "/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringBootController.class, args);
	}
}
