package com.org.demo.randomquotesjava;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomQuotesJavaController {
	
	
    @RequestMapping("/")
	public String home() {
		
		return "Hello World! Octopus Deployment";
	}

}
