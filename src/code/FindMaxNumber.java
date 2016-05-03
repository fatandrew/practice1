package code;

/**
 * Created by User on 03.05.2016.
 */
public class FindMaxNumber {
    public int max(int[] input){
        int largest =  Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > largest){
                largest = input[i];
            }

        }
        return largest;
    }

}
