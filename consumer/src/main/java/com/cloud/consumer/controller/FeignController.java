package com.cloud.consumer.controller;

import com.cloud.consumer.remote.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private UserRemote userRemote;

    @RequestMapping("/getUser")
    public String getUser(@RequestParam("name") String name){
        return userRemote.getUser(name);
    }
}
