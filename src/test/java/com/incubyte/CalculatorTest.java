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

}
