/**
 * 
 */
package com.apress.isf.spring;

import org.springframework.stereotype.Component;

/**
 * @author Felipe Gutierrez
 *
 */
@Component
public class HelloWorldMessage implements MessageService {
	
	public String getMessage() {
		return "Hello World";
	}
}
