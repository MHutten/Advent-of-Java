package advent_of_code._2015.Day_08;

public class Matchsticks {

    private static boolean is_hexadecimal_digit(char character) {
        return (character >= '0' && character <= '9') || (character >= 'a' && character <= 'f') || (character >= 'A' && character <= 'F');
    }

    public static int calculate_memory_length(String string) throws Exception {

        int length = 0;
        int index = 1;
        
        while (index < string.length() - 1) {

            if (string.charAt(index) != '\\') {
                index++;
            } else if (string.charAt(index + 1) == '\\' || string.charAt(index + 1) == '\"') {
                index += 2;
            } else if (string.charAt(index + 1) == 'x' && is_hexadecimal_digit(string.charAt(index + 2)) && is_hexadecimal_digit(string.charAt(index + 3))) {
                index += 4;
            } else {
                throw new Exception("Unexpected nech characters '" + string.charAt(index + 1) + "', '" + string.charAt(index + 2) + "', and '" + string.charAt(index + 3) + "' in string \"" + string + "\"");
            }

            length++;

        }

        return length;

    }

    public static int calculate_encoded_length(String string) {

        int length = 2;

        for (char character : string.toCharArray()) {

            if (character == '\"' || character == '\\') {
                length += 2;
            } else {
                length++;
            }

        }

        return length;

    }

}