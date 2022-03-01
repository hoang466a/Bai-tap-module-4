package controller;

import model.Dictionary;
import model.DictionaryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Locale;

@Controller
public class DictionaryController {
    @Autowired
    Dictionary dictionary;

    @GetMapping("/")
    public String begin(){
        return "dictionary";
    }

    @GetMapping("/dictionary")
    public String search(@RequestParam String english, Model model ){
        String vietnamese=null;
        HashMap<String,String> map=dictionary.mapDictionary();
        for(String word:map.keySet())
        {
            if((word.toLowerCase()).equals(english.toLowerCase()))
            {
                vietnamese=map.get(word);
                break;
            }
            else
            {
                vietnamese="not found";
            }
        }
        model.addAttribute("vietnamese",vietnamese);
        return "dictionary";
    }

}
