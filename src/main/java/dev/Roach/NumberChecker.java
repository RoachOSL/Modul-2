package dev.Roach;

import java.util.Scanner;

// ZAD 1
public class NumberChecker {

    Scanner scanner = new Scanner(System.in);

    public void checkNumber() {

        System.out.println("Type some number, to check if it bigger or lesser than 0");
        int number = Integer.parseInt(scanner.nextLine());

        if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
