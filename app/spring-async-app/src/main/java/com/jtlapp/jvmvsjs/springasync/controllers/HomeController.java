package com.jtlapp.jvmvsjs.springasync.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	String home() {
		return "Running spring-async\n";
	}
}
