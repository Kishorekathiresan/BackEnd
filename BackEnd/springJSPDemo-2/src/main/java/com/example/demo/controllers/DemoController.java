package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
 
 
public  class DemoController {
	@GetMapping("/hello")
	@ResponseBody
public String sayHello() {
	return "Hello";
}
	@GetMapping("/welcome")
public String sayWelcome() {
	return "welcome";
}
}