package advent_of_code._2015.Day_1;

public class Not_Quite_Lisp {

    public static int calculate_santas_final_destination(String directions) {

        int floor = 0;

        for (char direction: directions.toCharArray()) {

            if (direction == '(') {
                floor++;
            } else {
                floor--;
            }

        }
        
        return floor;

    }

    public static int calculate_basement_entering_instruction_position(String directions) {

        int floor = 0;

        for (int index = 0; index < directions.length(); index++) {

            if (directions.charAt(index) == '(') {
                floor++;
            } else {
                floor--;
            }

            if (floor < 0) {
                return index + 1;
            }

        }

        return -1;

    }

}

