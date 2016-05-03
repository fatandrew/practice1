package test;

import code.FindMaxNumber;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 03.05.2016.
 */
public class FindMaxNumberTest extends FindMaxNumber {
FindMaxNumber findMaxNumber = new FindMaxNumber();

    @Test
    public void testFindMaxNumber() throws Exception{
        int[] input = {16,7,89,5,55,};
        int expected = 89;
        int actualResult = findMaxNumber.max(input);
        Assert.assertEquals(expected, actualResult);
    }
}