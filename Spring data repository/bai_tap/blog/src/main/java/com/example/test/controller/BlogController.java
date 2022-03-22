package com.example.test.controller;


import com.example.test.model.Blog;
import com.example.test.service.IBlogService;
import com.example.test.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"/blog",""})
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;
    private boolean isSortByTime = true;
    @GetMapping("")
    public String display(@RequestParam(required = false,defaultValue = "hello") String sort, Model model){
        Pageable sortByDesc = PageRequest.of(0,3, Sort.by("time").descending());
        Pageable sortByAsc =PageRequest.of(0,3,Sort.by("time").ascending());

        if(isSortByTime){
            model.addAttribute("sort","true");
        }else{
            model.addAttribute("sort","false");
        }
        if(isSortByTime){
            Page<Blog> blogList = blogService.findAll(sortByDesc);
            model.addAttribute("blogList",blogList);
        }else{
            Page<Blog> blogList = blogService.findAll(sortByAsc);
            model.addAttribute("blogList",blogList);
        }
        return "blog/index";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("blog",new Blog());
        return "blog/create";
    }

    @PostMapping("/save")
    public String save(Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message","Add new blog successfull");
        return "redirect:blog/index";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable Integer id,Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "blog/edit";
    }
    @PostMapping("/edit")
    public String editBlog(Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "edit successfully");
        return "redirect:/blog/index";
    }





}
