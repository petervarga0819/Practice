package Practice;

import java.util.Arrays;
import java.util.ArrayList;
import java.lang.reflect.Array;

public class SumAll {

    public static void main(String[] args) {
// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`
    int aiSum = 0;
        int[] ai = {3, 4, 5, 6, 7};
        for (int i = 0; i < ai.length ; i++) {
            aiSum = aiSum + ai[i];
            System.out.println(aiSum );

        }

    }
}
