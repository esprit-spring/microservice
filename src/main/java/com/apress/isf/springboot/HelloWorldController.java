/**
 * 
 */
package com.apress.isf.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Felipe Gutierrez
 *
 */


@RestController
@EnableAutoConfiguration
//@Scope("session")
//@Scope("request") //par defaut singleton
public class HelloWorldController {
	private int count = 0;

    @RequestMapping("/")
    @ResponseBody
    String getMessage() {
        return "Hello World!  count=" + ++count;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorldController.class, args);
    }
}
