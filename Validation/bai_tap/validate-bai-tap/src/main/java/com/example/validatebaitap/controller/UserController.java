package com.example.validatebaitap.controller;

import com.example.validatebaitap.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping({"/user",""})
public class UserController {
    @GetMapping("")
    public String showForm(Model model){
        model.addAttribute("user", new User());
        return "/index";
    }

    @PostMapping("/login")
    public String showResult(@Valid User user, BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "/index";
        }else{
            model.addAttribute("user",user);
            return "/result";}
    }
}
