package dev.Roach;

import java.util.Scanner;

// ZAD 2
public class ThreeNumbersMean {

    Scanner scanner = new Scanner(System.in);

    public void average() {

        System.out.println("Type first number: ");
        double numberOne = Double.parseDouble(scanner.nextLine());
        while (numberOne <= 0 ) {
            System.out.println("Number must be greater than 0, type again!");
           numberOne = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Type second number: ");
        double numberTwo = Double.parseDouble(scanner.nextLine());
        while (numberTwo <= 0 ) {
            System.out.println("Number must be greater than 0, type again!");
            numberTwo = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Type third number: ");
        double numberThree = Double.parseDouble(scanner.nextLine());
        while (numberThree <= 0 ) {
            System.out.println("Number must be greater than 0, type again!");
            numberThree = Double.parseDouble(scanner.nextLine());
        }

        double average = (numberOne + numberTwo + numberThree) / 3;

        System.out.printf("Average is: %.2f", average);

    }
}
