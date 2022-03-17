package com.example.test.controller;


import com.example.test.model.Blog;
import com.example.test.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("")
    public String showAll(Model model){
        List<Blog> blogList=blogService.findAll();
        model.addAttribute("blogList",blogList);
        return"/index";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("blog",new Blog());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message","Add new blog successfull");

        return "/index";
    }

}
