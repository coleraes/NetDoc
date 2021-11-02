package com.NetDoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class TestController {

    @GetMapping("/test")
    public String greeting() {
        return "Hello, world!";
    }

}
