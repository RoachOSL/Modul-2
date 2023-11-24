package dev.Roach;

import java.util.Scanner;

// ZAD 6
public class SumInput {
    Scanner scanner = new Scanner(System.in);

    public void printSum() {

        int counter = 0;

        System.out.println("Type natural number, greater than or equal to zero in order to sum all of the numbers before this number(inclusive): ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            counter += i;
        }

        System.out.println(counter);
    }
}
