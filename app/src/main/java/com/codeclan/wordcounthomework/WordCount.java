package com.codeclan.wordcounthomework;

/**
 * Created by user on 08/08/2017.
 */

public class WordCount {

    public static int getCount(String string) {
        String[] stringArray = string.split(" ");
        return stringArray.length;

    }
}
