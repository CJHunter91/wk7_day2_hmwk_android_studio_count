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

//    public static HashMap<String,String> sumAllWords(String[] array){
//        for(String word: array){
//
//        }
//    }

    public static HashMap<String,Integer> sumWords(String[] array){

        HashMap<String, Integer> hash = new HashMap<>();

        for(String word: array){
            if(hash.containsKey(word)){
                hash.put(word, hash.get(word) + 1);
            }
            else {
                hash.put(word, 1);
            }
        }

        return hash;
    }
}
