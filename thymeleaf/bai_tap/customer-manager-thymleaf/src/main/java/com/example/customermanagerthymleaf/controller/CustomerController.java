package com.example.customermanagerthymleaf.controller;

import com.example.customermanagerthymleaf.model.Customer;
import com.example.customermanagerthymleaf.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping({"/customer",""})
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @GetMapping("")
    public String index(Model model){
        List<Customer> customers=iCustomerService.findAll();
        model.addAttribute("customers",customers);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model){
        return "/create";
    }

    @PostMapping("/save")
    public String save(Customer customer, RedirectAttributes redirectAttributes){
        iCustomerService.save(customer);
        redirectAttributes.addFlashAttribute("success","Add new Customer success");
        return "/customer";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("customer",iCustomerService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Customer customer,Model model){
        
    }




}
