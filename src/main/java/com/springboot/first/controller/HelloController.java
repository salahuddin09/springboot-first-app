package com.springboot.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// http://localhost:8080/hello
	@GetMapping(path="hello")
	public String getHelloMesg() {
		return "hello world";
	}
}
