package advent_of_code._2015.Day_10;

import java.lang.Character;

public class Elves_Look_Elves_Say {

    public static String look_and_say(String string) throws Exception {

        int length = 1;
        String output = "";
        int string_index = 0;

        while (string_index < string.length()) {

            if (!Character.isDigit(string.charAt(string_index))) {
                throw new Exception("'" + string.charAt(string_index) + "' is not a digit\n");
            }

            char digit = string.charAt(string_index);
            int count = 1;

            while (string_index + count < string.length() && string.charAt(string_index + count) == digit) {
                count++;
            }

            output += Integer.toString(count) + digit;
            string_index += count;

        }

        return output;

    }

}