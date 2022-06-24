package com.Prograd.SpringDemoApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/helloWorld")
    public String hello()
    {
        return "hello how are you";
    }
}
