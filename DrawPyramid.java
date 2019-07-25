package Practice;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        String stars;
        String spaces;

        Scanner numberinput = new Scanner(System.in);
        System.out.println("Type a number:");

        int number1 = numberinput.nextInt();
        for (int i = 1; i <= number1; i++) { //1 sor kiírása
           stars = "";
           spaces = "";
            for (int x = 1; x < number1 - i + 1; x++) {
                spaces = spaces + " ";
            }
            for (int j = 1; j <= i*2-1 ; j++) { //1 sor stringjének az összeállítása
                stars = stars + "*";
            }
            System.out.println(spaces  + stars);
        }
// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

    }
}
