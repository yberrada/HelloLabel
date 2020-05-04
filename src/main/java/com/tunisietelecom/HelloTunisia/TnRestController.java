package com.tunisietelecom.HelloTunisia;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TnRestController {
	
	
	@GetMapping("/hello")
	public String getHello() {
		//return "error";
			return "Welcome to Tunisie Telecom - Microservices Demo";
		
	}
	@GetMapping("/time")
	public String getLocalTime() {
		return "Time in tunisia is " + LocalDateTime.now();
	}
}
