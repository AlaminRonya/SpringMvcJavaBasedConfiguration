package com.alamin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String indexPage(){
        return "index";
    }
    @GetMapping("/homePage")
    public String homePage(){
        return "homePage";
    }
}
