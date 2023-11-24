package dev.Roach;

public class Factorial {

    public int factorialCounter(int number) {

        int placeholder = 1;
        int sum = 0;

        if (number < 2) {
            return 1;
        }

        for (int i = 2; i <= number; i++) {
            sum = placeholder * i;
            placeholder = sum;
        }
        return sum;
    }
}
