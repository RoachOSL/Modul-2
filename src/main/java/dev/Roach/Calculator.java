package dev.Roach;

import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);
    public void start() {

        boolean flag = true;

        while (flag) {

            int[] numbers = new int[2];

            System.out.println("Welcome to simple calculator!");

            for (int i = 0; i < 2; i++) {
               numbers[i] = getNumberFromUser();
            }

            while (flag) {
                switch (getOperationFromUser()) {
                    case "+" -> {
                        System.out.println("Result of addition is: " + add(numbers[0], numbers[1]));
                    }
                    case "-" -> {
                        System.out.println("Result of subtraction is: " + subtract(numbers[0], numbers[1]));
                    }
                    case "*" -> {
                        System.out.println("Result of multiplication is: " + multiply(numbers[0], numbers[1]));
                    }
                    case "/" -> {
                        System.out.println("Result of division is: " + divide(numbers[0], numbers[1]));
                    }
                    case "exit", "quit" -> flag = false;
                    default -> {
                        System.out.println("Invalid operation. Provide proper operation");
                    }
                }
            }
        }
    }

    private String getOperationFromUser() {
        System.out.println("""
                Type character or word from list below:
                "+" to add two numbers
                "-" to subtract two numbers
                "*" to multiply two numbers
                "/" to divide two numbers
                or
                "exit"/"quit" to leave the calculator""");
        return scanner.nextLine().trim().toLowerCase();
    }

    private int getNumberFromUser() {
        System.out.println("Type numbers that you want to operate with:");
        return scanner.nextInt();
    }

    private boolean isMoreThan0(int number) {
        return number > 0;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int divide(int a, int b) {
        if (isMoreThan0(b)) {
            return a / b;
        }
        System.out.println("You cannot divide by 0");
        return -1;
    }

    private int multiply(int a, int b) {
        return a * b;
    }


}
