package com.incubyte;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculatorTest {

    @Test
    public void shouldBeZeroIfEmptyString(){
        Assert.assertEquals(0,Calculator.Add(""));
    }

    @Test
    public void shouldReturnSumOfTwoNumber(){
        Assert.assertEquals(6,Calculator.Add("2,4"));
    }

    @Test
    public void ifInputHasOnlyOneNumber(){
        Assert.assertEquals(24,Calculator.Add("24"));
    }

    @Test
    public void shouldHandleMultipleNumbersAndReturnSum(){
        Assert.assertEquals(75,Calculator.Add("24,25,26"));
    }

    @Test
    public void shoulAllowNewLineAsDelimiter(){
        Assert.assertEquals(6,Calculator.Add("1\n2,3"));
    }


    @Test
    public void shouldSupportDifferentDelimiters(){
        Assert.assertEquals(3,Calculator.Add("//;\n1;2"));
    }

    @Test
    public void shouldThrowExceptionIfOneNumberIsNegative(){
        try{
            Calculator.Add("1,-2,3");
            fail("negatives not allowed");
        } catch (Exception e){
            assertEquals("negatives not allowed: -2 ",e.getMessage());
        }

    }

    @Test
    public void shouldThrowExceptionAndPrintAllNegativeNums(){
        try{
            Calculator.Add("1,-2,3,-4,-7,99,-102");
            fail("negatives not allowed");
        } catch (Exception e){
            assertEquals("negatives not allowed: -2 -4 -7 -102 ",e.getMessage());
        }

    }

}
