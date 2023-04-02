package com.example.lostark_tool.sample_get;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/v1/get-api")
public class getRequest {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String Hello() {
        return "Hello World!: Date: " + new Date();
    }
}
