package Practice;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

        Scanner scanner1 = new Scanner (System.in);
        System.out.println("Add a number: ");
        int number1 = scanner1.nextInt();
        if (number1 == 0) {
            System.out.println("fail");
        }
        else {
            float b = 10f / number1;
            System.out.println(b);
        }
    }
}
