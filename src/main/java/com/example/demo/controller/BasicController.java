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

    @GetMapping("/token")
    public String getToken() {
        return jwtManager.publish();
    }

    @GetMapping("/except")
    public String except01() {
        return "이 호출은  JWT 검증을 통해서만 호출이 되어야함";
    }

}

