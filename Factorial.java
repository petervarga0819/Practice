package Practice;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i);
            System.out.print("          ");
            System.out.println(factorio(i));
        }


    }


    public static long factorio(int numberInput) {
        long factorialValue = 1;
        for (int i = 1; i <= numberInput ; i++) {


            factorialValue = factorialValue * i;
        }


            return factorialValue;
    }

}

