package com.label.HelloLabel;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TnRestController {
	
	
	@GetMapping("/hello")
	public String getHello() {
		//return "error";
			return "Welcome to Label Vie - Microservices Demo";
		
	}
	@GetMapping("/time")
	public String getLocalTime() {
		return "Time in Morocco is " + LocalDateTime.now();
	}
}
