package Practice;

import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

    Scanner number1 = new Scanner(System.in);
    System.out.println("Type a number:");
    int num1 = number1.nextInt();

    Scanner number2 = new Scanner(System.in);
    System.out.println("Type a second number:");
    int num2 = number2.nextInt();

    if (num1 > num2){
        System.out.println(num1);
        }
    else if (num1 < num2) {
        System.out.println(num2);
        }
    else {
            System.out.println("The two numbers are even.");
        }
    }
}


// Write a program that asks for two numbers and prints the bigger one,