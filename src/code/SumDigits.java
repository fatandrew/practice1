package code;

public class SumDigits {
    public int sum(int number) {

        int result = 0;
        while (number != 0){

            result = Math.abs(result) + Math.abs(number) % 10;
            number /= 10;
}

        return result;

    }

}

