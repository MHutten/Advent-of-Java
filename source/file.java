package advent_of_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {

    public static String read(String file_path) {

        File file = new File(file_path);

        Scanner scanner;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) { // TODO Handle FileNotFoundException appropriately
            System.out.println("An error occurred.");
            e.printStackTrace();
            return "";
        }

        if (!scanner.hasNextLine()) {
            return "";
        }

        String file_content = scanner.nextLine();

        while (scanner.hasNextLine()) {
            file_content += '\n' + scanner.nextLine();
        }

        scanner.close();
        return file_content;

    }

}