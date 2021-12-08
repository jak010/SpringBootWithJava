package com.example.demo.controller;

import com.example.demo.Authenticate.JwtManager;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    JwtManager jwtManager;

    @GetMapping("/")
    public String example() {
        return "Hello World";
    }

    @GetMapping("/token")
    public String getToken() {
        return jwtManager.publish();
    }
}

