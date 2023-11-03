package _2015.Day_1_Not_Quite_Lisp;

public class NotQuiteLisp {
    
    public static int getSantasDestination(String directions) {
        int floor = 0;

        for (char direction: directions.toCharArray()) {
            floor += followDirection(direction);
        }

        return floor;
    }

    private static int followDirection(char direction) {
        switch (direction) {
            case '(':
                return 1;
            case ')':
                return -1;
            default:
                // TODO throw exception
                return 0;
        }
    }
}
