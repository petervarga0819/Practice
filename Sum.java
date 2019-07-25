package Practice;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        // Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
        System.out.println(sum1(9));
    }

    private static int sum1(int maxvalue){
        int sumvalue = 0;

        for (int i = 1; i <= maxvalue; i++) {

            sumvalue = sumvalue + i;

        }
            return sumvalue;

    }
}
