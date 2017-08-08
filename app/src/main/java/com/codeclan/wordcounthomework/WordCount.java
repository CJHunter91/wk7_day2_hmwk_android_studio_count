package com.codeclan.wordcounthomework;

import java.util.HashMap;

/**
 * Created by user on 08/08/2017.
 */

public class WordCount {



    public static int getCount(String string) {
        String[] stringArray = string.split(" ");
        return stringArray.length;

    }

    public static HashMap<String,String> sumWords(String[] array, String word){
        HashMap<String, String> hash = new HashMap<>();
        
    }
}
