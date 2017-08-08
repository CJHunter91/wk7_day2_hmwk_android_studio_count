package com.codeclan.wordcounthomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 08/08/2017.
 */

public class WordCountTest {


    String testString;

    @Before
    public void before(){
        testString = "I am a Test, I am a Test";
    }

    @Test
    public void canGetWordCount(){

        assertEquals(8, WordCount.getCount(testString));

    }
}
