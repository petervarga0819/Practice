package Practice;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Iterator;
import java.util.List;

public class CopyFile {
    public static void main(String... args) {
        System.out.println(copyFileFunction("C:\\Users\\varga\\Practice\\src\\sdo.txt", "C:\\Users\\varga\\Practice\\src\\sdo2.txt"));
    }

    public static boolean copyFileFunction(String fileToCopy, String fileToCreate){

        Path toCopy = Paths.get(fileToCopy);
        Path Destination = Paths.get(fileToCreate);

        try {
            List<String> lines = Files.readAllLines(toCopy);
            Files.write(Destination, lines );
        } catch (IOException f) {
            return false;
        }
        return true;
    }
}

    // Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

