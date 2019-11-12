package com.example.demo.ws.endpoint.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoEndpoint {

	@RequestMapping("/")
	public String hello() {
		return "hello world";
	}
	
	@RequestMapping("/")
	public String other() {
		return "patata";
	}
}
