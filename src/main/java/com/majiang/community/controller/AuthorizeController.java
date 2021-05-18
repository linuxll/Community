package com.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {
    @GetMapping("/callback")
    public String callback(@RequestParam(name="name")String name,
                           @RequestParam(name="state")String state){
        return "index";
    }
}
