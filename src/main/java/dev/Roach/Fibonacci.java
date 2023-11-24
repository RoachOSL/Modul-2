package dev.Roach;

import java.util.ArrayList;

// ZAD 7

//Tutaj wiem, że mogłem to dużo łątwiej zrobić niż w taki sposób bo pewnie optymalizacja tego jest strasznie słaba
// bo można to było zrobic na zwykłych prymitywach ale jakoś sie zablkowałem i zrobiłem tak jak umiałem


public class Fibonacci {

    public void printFibo(int number) {

        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        if (number <= 0 ) {
            number = 1;
        }

        for (int i = 0; i < number; i++) {
            if (i == 0 || i == 1) {
                System.out.println(i);
                arr.add(i);
            }  else {
                sum = arr.get(i - 1) + arr.get(i - 2);
                arr.add(sum);
                System.out.println(sum);
            }
        }
    }
}
