package Practice;

import java.util.HashMap;

public class MapIntroduction1 {

    public static void main(String[] args) {
        //Create an empty map where the keys are integers and the values are characters

        HashMap <Integer, String> mapIntro = new HashMap();

        //Print out whether the map is empty or not.
        System.out.println(mapIntro.isEmpty());

        //Add the following key-value pairs to the map.

        mapIntro.put(97, "a");
        mapIntro.put(98, "b");
        mapIntro.put(99, "c");
        mapIntro.put(65, "A");
        mapIntro.put(66, "B");
        mapIntro.put(67, "C");

        System.out.println(mapIntro.keySet());
        System.out.println(mapIntro.values());

        mapIntro.put(68, "D");

        System.out.println(mapIntro.size());

        System.out.println(mapIntro.get(99));

        mapIntro.remove(97);

        System.out.println(mapIntro.containsKey(100));

        mapIntro.clear();









    }
}
