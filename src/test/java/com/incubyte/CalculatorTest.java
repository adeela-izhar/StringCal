package com.incubyte;

import org.junit.Assert;
import org.junit.Test;

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

}
