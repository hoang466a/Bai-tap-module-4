package com.dictionary.service;

import com.dictionary.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    DictionaryService dictionary;

    @Override
    public HashMap<String, String> mapDictionary() {
        HashMap<String,String>dictionary=new HashMap<>();
        dictionary.put("cat","con mèo");
        dictionary.put("dog","chó");
        dictionary.put("car","xe ô tô");
        dictionary.put("cake","bánh");
        dictionary.put("coke","nước có ga");
        return dictionary;
    }

    public String search(String english){
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
        return vietnamese;
    }
}
