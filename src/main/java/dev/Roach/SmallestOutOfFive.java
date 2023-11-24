package dev.Roach;

import java.util.Scanner;

// ZAD 3
public class SmallestOutOfFive {

    Scanner scanner = new Scanner(System.in);

    public double checkNumber() {
        double placeholder = Integer.MAX_VALUE;

        for (int i = 1; i < 6; i++) {
            System.out.println("Type " + i + " number:");
            double number = Double.parseDouble(scanner.nextLine());

            if (number < placeholder) {
                placeholder = number;
            }

        }
        return placeholder;
    }
}
