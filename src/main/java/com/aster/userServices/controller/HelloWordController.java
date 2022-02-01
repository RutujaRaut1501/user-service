package com.aster.userServices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

	@GetMapping("/hello")
	public String helloMessage() {
		return "Welcome To Spring Boot Application !!!!! Using Jenkin CICD";
	}
}
