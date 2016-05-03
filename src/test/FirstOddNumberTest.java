package test;

import code.FirstOddNumber;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstOddNumberTest extends FirstOddNumber {
    FirstOddNumber firstOddNumber = new FirstOddNumber();

    @Test
    public void testFindOddNumber() throws Exception{
        int[] input = {2,4,1};
        int expected = 2;
        int actualResult = firstOddNumber.find(input);
        Assert.assertEquals(expected, actualResult);
    }


}