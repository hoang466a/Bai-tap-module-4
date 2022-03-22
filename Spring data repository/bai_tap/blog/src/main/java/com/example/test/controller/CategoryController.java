package com.example.test.controller;


import com.example.test.model.Category;
import com.example.test.service.ServiceImpl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"/category",""})
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/list")
    public String displayList(@PageableDefault(size=5) Pageable pageable, Model model){
        Page<Category> categoryPage=categoryService.findAll(pageable);
        model.addAttribute("categoryPage",categoryPage);
        return "/list";
    }

    @GetMapping("show-create-form")
    public String displayCreate(Model model){
        model.addAttribute("category", new Category());
        return "/create";
    }

    @PostMapping("/return-list")
    public String addCategory(Category category){
        categoryService.save(category);
        return "redirect:/list";
    }

    @GetMapping("edit/{id}")
    public String displayEdit(Model model, @PathVariable int id){
        Category category=categoryService.findById(id);
        model.addAttribute("category",category);
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("category") Category category){
        categoryService.save(category);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String displayDelete(@PathVariable int id,Model model){
        Category category=categoryService.findById(id);
        model.addAttribute("category",category);
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(RedirectAttributes redirectAttributes,Category category){
    categoryService.delete(category);
    return "redirect:/list";
    }
}
