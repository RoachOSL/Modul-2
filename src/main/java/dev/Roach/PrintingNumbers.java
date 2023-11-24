package dev.Roach;

import java.util.Scanner;

// ZAD 5
public class PrintingNumbers {
    Scanner scanner = new Scanner(System.in);

    public void printNumbers() {

        System.out.println("Type natural number, greater than or equal to zero");
        int number = scanner.nextInt();

        // nie wiedziałem czy ma to być włącznie z tą liczbą czy nie, jeśli tak to trzeba zmienic w pętli
        // na i <= number

        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }
}
