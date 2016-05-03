package code;

/**
 * Created by User on 03.05.2016.
 */
public class MatrixSnakeTraversal {
    public int[] print(int[] [] input){
        int[] result = new int[input.length * input[0].length];
        int index = 0;

        for (int i = 0; i < input.length; i++) {

            for (int j = 0; j < input[i].length ; j++) {
                result[index] = input[i][j];
                index++;
            }

        }
        return result;
    }
}
