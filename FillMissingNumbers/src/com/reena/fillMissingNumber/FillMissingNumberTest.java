package com.reena.fillMissingNumber;

import org.junit.Assert;
import org.junit.Test;

public class FillMissingNumberTest {

    @Test
    public void testFillMissingNumberForValidInput1(){
        int [] input  = new int[] {2,1,4,5};
        int [] expected  = new int[] {1,2,3,4,5};
        Assert.assertArrayEquals(expected, Main.fillMissingNumbers(input));
    }

    @Test
    public void testFillMissingNumberForInValidInput(){
        int [] input  = new int[] {-1};
        int [] expected  = new int[] {};
        Assert.assertArrayEquals(expected, Main.fillMissingNumbers(input));
    }

    @Test
    public void testFillMissingNumberForValidInput2(){
        int [] input  = new int[] {58,60,55};
        int expectedLength = 60;
        Assert.assertTrue("PASS", Main.fillMissingNumbers(input).length == expectedLength);
    }

    @Test
    public void testFillMissingNumberForEmptyArray(){
        int [] input  = new int[] {};
        int [] expected  = new int[] {};

        Assert.assertArrayEquals(expected, Main.fillMissingNumbers(input));
    }

    @Test(expected = NullPointerException.class)
    public void testFillMissingNumberForNull(){
        int [] input = null;
        int [] expected = null;
        Assert.assertArrayEquals(expected, Main.fillMissingNumbers(input));
    }
}
