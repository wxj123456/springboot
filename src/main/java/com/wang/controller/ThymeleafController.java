package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
    @RequestMapping("/thymeleaf")
    public String thymeleaf(ModelMap map) {
        map.addAttribute("enjoy", "enjoy");
        return "testThymeleaf";
    }
}
