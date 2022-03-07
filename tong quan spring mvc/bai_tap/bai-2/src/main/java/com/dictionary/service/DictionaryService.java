package com.dictionary.service;

import java.util.HashMap;

public interface DictionaryService {
    public HashMap<String,String> mapDictionary();
    public String search(String english);
}
