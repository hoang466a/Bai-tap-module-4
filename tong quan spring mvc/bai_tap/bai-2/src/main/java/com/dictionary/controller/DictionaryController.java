package com.dictionary.controller;

import com.dictionary.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class DictionaryController {
    @Autowired
    DictionaryService dictionary;

    @GetMapping("/")
    public String begin(){
        return "/dictionary";
    }

    @GetMapping("/dictionary")
    public String search(@RequestParam String english, Model model ){

        model.addAttribute("vietnamese",dictionary.search(english));
        return "/dictionary";
    }

}
