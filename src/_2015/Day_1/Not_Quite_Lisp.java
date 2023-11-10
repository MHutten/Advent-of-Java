package src._2015.Day_1;

import java.io.IOException;

public class Not_Quite_Lisp {
    
    public static int getSantasDestination(String directions) throws Exception {
        int floor = 0;

        for (char direction: directions.toCharArray()) {
            try {
                floor = Math.addExact(floor, followDirection(direction));
            } catch (Exception e) {
                throw e;
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
                throw new IOException("Invalid directions: contains character " + direction);
        }
    }

    public static int santaEntersBasementAt(String directions) throws Exception {
        int floor = 0;
        int instruction_count = 0;

        for (char direction: directions.toCharArray()) {
            try {
                floor = Math.addExact(floor, followDirection(direction));
            } catch (Exception e) {
                throw e;
            }

            instruction_count++;

            if (floor == -1) {
                return instruction_count;
            }
        }

        throw new NeverEnteredBasementException();
    } 
}
