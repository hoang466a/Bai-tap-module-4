package com.hoang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CondimentController {
    ModelAndView modelAndView;
    @RequestMapping("/")
    public String home(){
        return "condiments";
    }

    @PostMapping("/action")
    public ModelAndView show(){
        return
    }



}
