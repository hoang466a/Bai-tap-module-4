package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ConvertController {
    @GetMapping("/")
    public String home(){
        return "convert";
    }

    @GetMapping("/convert")
    public String convert(@RequestParam Double usd, Double rate, Model model){
        Double valueOfConvert=usd*rate;
        model.addAttribute("valueOfConvert",valueOfConvert);
        return "convert";
    }
}
