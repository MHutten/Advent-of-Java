package advent_of_code._2015.Day_05;

public class Doesnt_He_Have_Intern_Elves_For_This {

    private static boolean is_vowel(char character) {

        String vowels = "aeiou";
        int index = 0;

        for (char vowel: vowels.toCharArray()) {

            if (character == vowel) {
                return true;
            }

        }

        return false;

    }

    private static boolean is_naughty_substring(String string) {

        String[] naughty_substrings = {"ab", "cd", "pq", "xy"};
        int index = 0;

        for (String naughty_substring: naughty_substrings) {

            if (string.equals(naughty_substring)) {
                return true;
            }

        }

        return false;

    }

    private static boolean occurs_at_least_twice(String sub, String sup, int start) {

        for (int sup_index = start; sup_index < sup.length() - 1; sup_index++) {

            boolean is_match = true;

            for (int sub_index = 0; sub_index < sub.length(); sub_index++) {

                if (sub.charAt(sub_index) != sup.charAt(sup_index + sub_index)) {
                    is_match = false;
                }

            }

            if (is_match) {
                return true;
            }

        }

        return false;

    }

    public static boolean is_nice(String string) {
    
        boolean contains_consecutives = false;
        int vowel_count = 0;

        if (is_vowel(string.charAt(0))) {
            vowel_count++;
        }

        for (int index = 1; index < string.length(); index++) {

            if (is_naughty_substring(string.substring(index-1, index+1))) {
                return false;
            }

            if (is_vowel(string.charAt(index))) {
                vowel_count++;
            }

            if (string.charAt(index-1) == string.charAt(index)) {
                contains_consecutives = true;
            }

        }

        return contains_consecutives && (vowel_count > 2);

    }

    public static boolean is_nice_now(String string) {

        boolean contains_multiple_non_overlapping_duplicate_pairs = false;
        boolean contains_repeating_character_seperated_by_one_character = false;

        if (occurs_at_least_twice(string.substring(0, 2), string, 2)) {
            contains_multiple_non_overlapping_duplicate_pairs = true;
        }

        for (int index = 2; index < string.length(); index ++) {

            if (occurs_at_least_twice(string.substring(index - 1, index + 1), string, index + 1)) {
                contains_multiple_non_overlapping_duplicate_pairs = true;
            }

            if (string.charAt(index - 2) == string.charAt(index)) {
                contains_repeating_character_seperated_by_one_character = true;
            }

            if (contains_multiple_non_overlapping_duplicate_pairs && contains_repeating_character_seperated_by_one_character) {
                return true;
            }

        }

        return false;

    }

}