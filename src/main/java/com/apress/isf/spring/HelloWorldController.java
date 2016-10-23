/**
 * 
 */
package com.apress.isf.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Felipe Gutierrez
 *
 */
//Pour lancer spring boot il faudra mentionner cette classe comme main class :
// run -DmainClass=com.apress.isf.spring.HelloWorldController

@Controller
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    String getMessage() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorldController.class, args);
    }
}
