package test;

import code.SumDigits;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumDigitsTest extends SumDigits {
    SumDigits sumDigits = new SumDigits();
    @Test
    public void testSumNumbers() throws Exception{
        int number = -2147483648;
        int expected = 47;
        int actualResult = sumDigits.sum(number);
        Assert.assertEquals(expected, actualResult);

    }

}