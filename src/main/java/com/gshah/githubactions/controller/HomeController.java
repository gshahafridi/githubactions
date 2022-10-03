package com.gshah.githubactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String helloWorld(){
        return "Hello World fro spring boot ";
    }
}
