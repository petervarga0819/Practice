package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CompareLength {

    public static void main(String[] args) {

// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print "p2 is longer" if `p2` has more elements than `p1`

        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5};

        if (Array.getLength(p2)> Array.getLength(p1)) {

            System.out.println("p2 is longer.");

        }
    }
}