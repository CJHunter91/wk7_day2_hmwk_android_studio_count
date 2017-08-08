package com.codeclan.wordcounthomework;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 08/08/2017.
 */

public class WordCountTest {


    String testString;
    HashMap<String, String> testHash;
    String[] stringArray;


    @Before
    public void before(){
        testString = "I am a Test I am a Test";
        stringArray = testString.split(" ");
        testHash = new HashMap<>();
    }

    @Test
    public void canGetWordCount(){

        assertEquals(stringArray.length, WordCount.getCount(testString));

    }

    @Test
    public void canGetSumNumWords(){

        testHash.put("Test", "2");
        assertEquals(testHash, WordCount.sumOneWord(stringArray, "Test"));
    }

    @Test
    public void canSumAllWords(){
        testHash.put("I", "2");
        testHash.put("am", "2");
        testHash.put("a", "2");
        testHash.put("Test", "2");
        assertEquals(testHash, WordCount.sumAllWords(stringArray));
    }
}
