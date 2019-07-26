package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public class ListIntroduction1 {
    public static void main(String[] args) {

        //Create an empty list which will contain names (strings).

        ArrayList<String> names = new ArrayList<>();

        //Print out the number of elements in the list.
        System.out.println(names.size());

        //Add William to the list.

        names.add("William");

        //Print out whether the list is empty or not.

        System.out.println("Is empty: " + names.isEmpty());

        //Add John to the list
        names.add("John");

        //Add Amanda to the list
        names.add("Amanda");

        //Print out the number of elements in the list.
        System.out.println("Size of the list:" + names.size());

        //Print out the 3rd element

        System.out.println("Third element: " + names.get(2));

        //Iterate through the list and print out each name
        Iterator xy = names.iterator();

        while(xy.hasNext()) {
            System.out.println(xy.next());
        }
            //Remove the 2nd element
            names.remove(1);

            //Remove all elements

            names.clear();


    }
}
