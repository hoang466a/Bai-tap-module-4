package com.example.customphonevalidation.Controller;


import com.example.customphonevalidation.Model.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhoneController {
    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("phoneNumber",new PhoneNumber);
        return "/index";
    }
}


