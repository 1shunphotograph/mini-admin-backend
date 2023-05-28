package com.example.springboot_vue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootVueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootVueApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "mini-admin") String name) {
		return String.format("欢迎来到"+name+"！");
	}

}
