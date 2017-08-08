package com.codeclan.wordcounthomework;

import java.util.HashMap;

/**
 * Created by user on 08/08/2017.
 */

public class WordCount {



    public static int getCount(String string) {
        string.replaceAll(",", "");
        String[] stringArray = string.split(" ");
        return stringArray.length;

    }

    public static HashMap<String,String> sumOneWord(String[] array, String wordToCheck){
        HashMap<String, String> hash = new HashMap<>();
        int count = 0;

        for(String word: array){
            if(word.equals(wordToCheck)){
                count++;
            }
        }
        hash.put(wordToCheck, Integer.toString(count));
        return hash;
    }
}
