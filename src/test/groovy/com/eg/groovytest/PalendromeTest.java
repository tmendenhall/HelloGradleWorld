package com.eg.groovytest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.Assert.assertTrue;

/**
 * User: tylermendenhall
 * Date: 9/25/13
 */
@RunWith(JUnit4.class)
public class PalendromeTest {


    private PalendromeChecker palendrome;

    @Before
    public void begin(){
        palendrome = new PalendromeChecker();
    }

    @Test
    public void ValidTest(){
        assertTrue(palendrome.isPalendrome("ABBA"));
    }
}
