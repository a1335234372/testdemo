package com.song.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
// 单行注释
public class HelloControlle {
    @GetMapping("/sayhello")
    public  String  sayHello(){
        return "Hello! world";
    }
}

