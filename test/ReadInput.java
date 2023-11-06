package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadInput {

    public static String readInput(String relativePath) {
        try {
            File file = new File(System.getProperty("user.dir") + relativePath);
            Scanner scanner = new Scanner(file);
            String output = "";
            while (scanner.hasNextLine()) { // For some reason something goes wrong here where seperate lines are not recognized as such
                output += scanner.nextLine();
            }
            scanner.close();
            return output;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return "";
        }
    }
}
