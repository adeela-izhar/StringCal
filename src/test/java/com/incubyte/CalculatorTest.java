package com.incubyte;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldBeZeroIfEmptyString(){
        Assert.assertEquals(0,Calculator.Add(""));
    }

}
