package com.cloud.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/getUser")
    public String getUser(@RequestParam("name") String name){
        return "hello "+name+ " good evening !";
    }
}
