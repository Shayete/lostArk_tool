package com.example.lostark_tool.sample_get;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String Hello() {
        return "Hello World!";
    }

}
