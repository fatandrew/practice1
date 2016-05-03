package code;

public class SumDigits {
    public int sum(int number) {

        String digits = new Integer(number).toString();
        int result = 0;
        for (char c: digits.toCharArray())
        result += c - '0';
        return result;

    }
}

