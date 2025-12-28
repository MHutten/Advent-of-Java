package advent_of_code._2015.Day_05;

import advent_of_code.file;

public class Part_1 {

    public static void main(String[] args) {

        int number_of_nice_strings = 0;

        for (String line: file.read_lines(args[0])) {

            if (Doesnt_He_Have_Intern_Elves_For_This.is_nice(line)) {
                number_of_nice_strings++;
            }
            
        }

        System.out.println(number_of_nice_strings);

    }

}