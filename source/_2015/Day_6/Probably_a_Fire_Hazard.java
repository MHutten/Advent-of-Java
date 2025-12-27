package advent_of_code._2015.Day_6;

import java.util.Arrays;

public class Probably_a_Fire_Hazard {

    public static Operation parse_operation_string(String string) {

        String[] substrings = string.split(" ");
        String operation;

        if (substrings[0].equals("turn")) {

            operation = substrings[1];
            substrings = Arrays.copyOfRange(substrings, 2, substrings.length);

        } else {

            operation = substrings[0];
            substrings = Arrays.copyOfRange(substrings, 1, substrings.length);

        }

        String[] start = substrings[0].split(",");
        String[] end = substrings[2].split(",");

        Operation output = new Operation(
            operation,
            new int[]{
                Integer.parseInt(start[0]),
                Integer.parseInt(start[1])
            },
            new int[]{
                Integer.parseInt(end[0]),
                Integer.parseInt(end[1])
            }
        );

        return output;

    }

}