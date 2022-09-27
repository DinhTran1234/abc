package com.example.ajax_th2.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/")
    public String showIndex() {
        return "/index";
    }
}
