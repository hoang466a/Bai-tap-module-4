package model;

import java.util.HashMap;

public class DictionaryImpl implements Dictionary{

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
}
