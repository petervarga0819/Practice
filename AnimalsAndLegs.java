package Practice;
import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner chickens = new Scanner(System.in);
        System.out.println("Type the number of chickens");
        int numberOfChicken = chickens.nextInt();


        Scanner pigs = new Scanner(System.in);
        System.out.println("Type the number of pigs");
        int numberOfPigs = pigs.nextInt();

        System.out.println("They have " + ((numberOfChicken * 2) + (numberOfPigs * 4)) + " legs." );

    }
}
