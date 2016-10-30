package com.apress.isf.java;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessage implements MessageService {
	
	public String getMessage() {
		return "Hello World";
	}
}
