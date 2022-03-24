package com.example.casestudy.controller;

import com.example.casestudy.model.Employee_model.Employee;
import com.example.casestudy.repository.Employee.IPositionRepository;
import com.example.casestudy.service.Employee.IDivisionService;
import com.example.casestudy.service.Employee.IEducationDegreeService;
import com.example.casestudy.service.Employee.IEmployeeService;
import com.example.casestudy.service.Employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;
    @Autowired
    private IDivisionService iDivisionService;
    @Autowired
    private IEducationDegreeService iEducationDegreeService;
    @Autowired
    private IPositionService iPositionService;
    @GetMapping("/")
    public ModelAndView employeeShow(@PageableDefault(value = 5) Pageable pageable){

        ModelAndView modelAndView=new ModelAndView("employee/list");
        modelAndView.addObject("employeeList",iEmployeeService.findAll(pageable));
        modelAndView.addObject("divisionList",iDivisionService.findAll());
        modelAndView.addObject("educationDegreeList",iEducationDegreeService.findAll());
        modelAndView.addObject("positionList",iPositionService.findAll());
        return modelAndView;
    }

    @GetMapping("/employee/create")
    public ModelAndView employeeShowCreate(){
        ModelAndView modelAndView=new ModelAndView("employee/create");
        modelAndView.addObject("employee",new Employee());
        modelAndView.addObject("divisionList",iDivisionService.findAll());
        modelAndView.addObject("educationDegreeList",iEducationDegreeService.findAll());
        modelAndView.addObject("positionList",iPositionService.findAll());
        return modelAndView;
    }

    @PostMapping("/save")
    public String addEmployee(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes){
        iEmployeeService.save(employee);
        redirectAttributes.addFlashAttribute("massage","Save Employee"+employee.getEmployeeName()+"successful!");
        return "redirect:/";
    }

}
