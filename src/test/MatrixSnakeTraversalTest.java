package test;

import code.MatrixSnakeTraversal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 03.05.2016.
 */
public class MatrixSnakeTraversalTest extends MatrixSnakeTraversal {
MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();

    @Test
    public void testMatrixSnake() throws Exception{
        int [][] input = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int[] expected = {1,4,7,2,5,8,3,6,9};
        int[] actualResult = matrixSnakeTraversal.print(input);
        Assert.assertEquals(expected, actualResult);
    }
}