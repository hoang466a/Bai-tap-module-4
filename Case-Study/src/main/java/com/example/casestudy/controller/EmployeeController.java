package com.example.casestudy.controller;

import com.example.casestudy.DTO.EmployeeDTO;
import com.example.casestudy.model.Employee_model.Employee;
import com.example.casestudy.repository.Employee.IPositionRepository;
import com.example.casestudy.service.Employee.IDivisionService;
import com.example.casestudy.service.Employee.IEducationDegreeService;
import com.example.casestudy.service.Employee.IEmployeeService;
import com.example.casestudy.service.Employee.IPositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.transaction.Transaction;
import javax.validation.Valid;

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
    public ModelAndView employeeShow() {
        ModelAndView modelAndView = new ModelAndView("/index");
        return modelAndView;
    }

    @GetMapping("/employee")
    public ModelAndView employeeShow(@PageableDefault(value = 3, sort = "employeeId", direction = Sort.Direction.ASC) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("employee/list");
        modelAndView.addObject("employeeList", iEmployeeService.findAll(pageable));
        modelAndView.addObject("divisionList", iDivisionService.findAll());
        modelAndView.addObject("educationDegreeList", iEducationDegreeService.findAll());
        modelAndView.addObject("positionList", iPositionService.findAll());
        return modelAndView;
    }

    @GetMapping("/employee/create")
    public ModelAndView employeeShowCreate() {
        ModelAndView modelAndView = new ModelAndView("employee/create");
        modelAndView.addObject("employee", new EmployeeDTO());
        modelAndView.addObject("divisionList", iDivisionService.findAll());
        modelAndView.addObject("educationDegreeList", iEducationDegreeService.findAll());
        modelAndView.addObject("positionList", iPositionService.findAll());
        return modelAndView;
    }

    @PostMapping("/save")
    public String addEmployee( @Validated @ModelAttribute("employee") EmployeeDTO employeeDTO, BindingResult bindingResult,Model model) {
   Employee employee =new Employee();
        if (bindingResult.hasErrors()) {
            model.addAttribute("divisionList", iDivisionService.findAll());
            model.addAttribute("educationDegreeList", iEducationDegreeService.findAll());
            model.addAttribute("positionList", iPositionService.findAll());
            return "employee/create";
        }else {
            BeanUtils.copyProperties(employeeDTO, employee);
            iEmployeeService.save(employee);
            return "redirect:/employee";
        }

    }

    @PostMapping("/employee/delete")
    public String deleteEmployee(@RequestParam("id") Integer id) {
        iEmployeeService.deleteById(id);
        return "redirect:/employee";
    }

    @GetMapping("/employee/{id}/view")
    public ModelAndView employeeShowView(@PathVariable int id) {
        Employee employee=iEmployeeService.findById(id);
        ModelAndView modelAndView = new ModelAndView("employee/view");
        modelAndView.addObject("employee", employee);
        modelAndView.addObject("divisionList", iDivisionService.findAll());
        modelAndView.addObject("educationDegreeList", iEducationDegreeService.findAll());
        modelAndView.addObject("positionList", iPositionService.findAll());
        return modelAndView;
    }

    @GetMapping("/employee/{id}/edit")
    public ModelAndView employeeShowEdit(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/employee/edit");
        modelAndView.addObject("employee", iEmployeeService.findById(id));
        modelAndView.addObject("divisionList", iDivisionService.findAll());
        modelAndView.addObject("educationDegreeList", iEducationDegreeService.findAll());
        modelAndView.addObject("positionList", iPositionService.findAll());
        return modelAndView;
        }


    @PostMapping("/update")
    public String employeeUpdate( Employee employee) {
        iEmployeeService.save(employee);
        return "redirect:/employee";
    }

   @GetMapping("/search")
    public String employeeSearchByName(@PageableDefault(value = 3, sort = "employeeId", direction = Sort.Direction.ASC) Pageable pageable, @RequestParam(name="keySearch",required = false)String name,@RequestParam(name = "choice",required = false)String choice ,Model model) {
       if (choice.equals("searchId")){
           int id  = Integer.parseInt(name);
           model.addAttribute("employeeList",iEmployeeService.findByEmployeeId(id,pageable));
       }else if (choice.equals("searchName")){
           model.addAttribute("employeeList",iEmployeeService.employeeSearchByName(name,pageable));
       }
       return "/employee/list";
    }


}
