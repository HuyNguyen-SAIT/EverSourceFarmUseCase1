package com.example.usecase1.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class HelloWorld {


    public String index() {
        return "Hello World!";
    }
}
