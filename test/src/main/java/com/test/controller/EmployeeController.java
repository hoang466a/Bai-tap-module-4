package com.test.controller;


import com.test.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @GetMapping(value="/show")
    public String showInfo(Model model){
        model.addAttribute("employee",new Employee());
        return "create";
    }

    @PostMapping(value="/addInfo")
    public String addInfo(@ModelAttribute("employee") Employee employee, Model model){
        model.addAttribute("id",employee.getId());
        model.addAttribute("name",employee.getName());
        model.addAttribute("contact",employee.getContactNumber());
        return "info" ;
    }

}
