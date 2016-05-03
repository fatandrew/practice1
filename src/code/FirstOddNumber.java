package code;


public class FirstOddNumber{
    public int find(int[] input){
        //int result = 0;

        for (int i = 0; i < input.length ; i++) {

            if (input[i] % 2 != 0){
            return i;

            }
        }
        return -1;
    }
}
