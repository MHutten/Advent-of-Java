package src._2015.Day_1_Not_Quite_Lisp;

import java.io.IOException;

public class NotQuiteLisp {
    
    public static int getSantasDestination(String directions) {
        int floor = 0;

        for (char direction: directions.toCharArray()) {
            try {
                floor += followDirection(direction);
            } catch (IOException e) {
                return 0; // TODO figure out how to test for thrown exceptions
            }
        }

        return floor;
    }

    private static int followDirection(char direction) throws IOException {
        switch (direction) {
            case '(':
                return 1;
            case ')':
                return -1;
            default:
                throw new IOException("Invalid directions: contains character" + direction);
        }
    }

    public static int santaEntersBasementAt(String directions) {
        int floor = 0;
        int instruction_count = 0;

        for (char direction: directions.toCharArray()) {
            try {
                floor += followDirection(direction);
            } catch (IOException e) {
                return 0; // TODO figure out how to test for thrown exceptions
            }

            instruction_count++;

            if (floor == -1) {
                return instruction_count;
            }
        }

        return 0; // TODO replace with thrown Exception
    } 
}
