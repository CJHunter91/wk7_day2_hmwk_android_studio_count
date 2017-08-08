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


    @Before
    public void before(){
        testString = "I am a Test, I am a Test";
        testHash = new HashMap<>();
    }

    @Test
    public void canGetWordCount(){

        assertEquals(8, WordCount.getCount(testString));

    }

    @Test
    public void canGetSumNumWords(){
        testHash.put("Test", "2");
        assertEquals(testHash, WordCount.sumWords(testString));
    }
}
