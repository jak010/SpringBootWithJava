package com.example.demo.controller;


import com.example.demo.Handler.VulnerableLog4JExampleHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    static Logger log = LogManager.getLogger("Hello World");

    @GetMapping("/")
    public String Example(@RequestHeader("X-Api-Version") String header) {
        log.info("Received A request for API Version: {} ", header);

        return "Test \n";
    }
}
