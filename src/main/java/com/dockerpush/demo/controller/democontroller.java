package com.dockerpush.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {

      @GetMapping("/hotels")
    public  String getMessage(){
        return "hello world";
    }
}
