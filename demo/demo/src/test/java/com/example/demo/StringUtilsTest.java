package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {


    /* TEST VOWELS */
    @Test
    public void testVowelsEmpty() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.vowels("");
        Assert.assertEquals("", result);
    }

    @Test()
    public void testVowelsNullException() {
        StringUtils stringUtils = new StringUtils();
        Assert.assertThrows(NullPointerException.class, () -> {
            stringUtils.vowels(null);
        });
    }

    @Test()
    public void testVowelsOneVowel() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.vowels("a");
        Assert.assertEquals("a", result);
    }

    @Test()
    public void testVowelsOneConsonant() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.vowels("w");
        Assert.assertEquals("", result);
    }

    @Test()
    public void testVowelsTwoConsonants() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.vowels("ww");
        Assert.assertEquals("", result);
    }

    @Test()
    public void testVowelsTwoVowels() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.vowels("ae");
        Assert.assertEquals("ae", result);
    }

    @Test()
    public void testVowelsShuffle() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.vowels("aqzegqree");
        Assert.assertEquals("aeee", result);
    }
    
    @Test()
    public void testVowelsShuffleWithUppercase() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.vowels("aqzEgqreE");
        Assert.assertEquals("aEeE", result);
    }

    @Test()
    public void testVowelsWithNumber() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.vowels("1");
        Assert.assertEquals("", result);
    }

    /* TEST UNIQ VOWELS */
    @Test
    public void testUniqueVowelsEmpty() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.uniqueVowels("");
        Assert.assertEquals("", result);
    }

    @Test()
    public void testUniqueVowelsNullException() {
        StringUtils stringUtils = new StringUtils();
        Assert.assertThrows(NullPointerException.class, () -> {
            stringUtils.uniqueVowels(null);
        });
    }

    @Test()
    public void testUniqueVowelsOneVowel() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.uniqueVowels("a");
        Assert.assertEquals("a", result);
    }

    @Test()
    public void testUniqueVowelsOneConsonant() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.uniqueVowels("w");
        Assert.assertEquals("", result);
    }

    @Test()
    public void testUniqueVowelsTwoConsonants() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.uniqueVowels("ww");
        Assert.assertEquals("", result);
    }

    @Test()
    public void testUniqueVowelsTwoVowels() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.uniqueVowels("ae");
        Assert.assertEquals("ae", result);
    }

    @Test()
    public void testUniqueVowelsShuffle() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.uniqueVowels("aqzegqree");
        Assert.assertEquals("ae", result);
    }
    
    @Test()
    public void testUniqueVowelsShuffleWithUppercase() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.uniqueVowels("aqzEgqreE");
        Assert.assertEquals("aEe", result);
    }

    @Test()
    public void testUniqueVowelsWithNumber() {
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.uniqueVowels("1");
        Assert.assertEquals("", result);
    }
}
