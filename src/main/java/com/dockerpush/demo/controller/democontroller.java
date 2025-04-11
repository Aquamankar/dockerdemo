package com.dockerpush.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {

    public  String getMessage(){
        return "hello world";
    }
}
