package dev.Roach;

// ZAD 4
public class Triangle {

    public void drawTriangle(int number) {

        if (number < 0) {
            number = 0;
        }

        for (int i = 0; i <= number; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
