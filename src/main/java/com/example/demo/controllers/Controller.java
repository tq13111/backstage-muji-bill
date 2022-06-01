package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/a")
public class Controller {
    @GetMapping("/xxx")
    public String getName( @RequestParam("name") String name1) {
        return "111"+ name1;
    }
}