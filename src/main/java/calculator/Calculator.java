package calculator;

public class Calculator {
    private int sum;

    public Calculator() {
    }

    public int add(String digit, String delimiter) {
        String[] arr = digit.split(delimiter);

        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
