package advent_of_code._2015.Day_08;

import advent_of_code.file;

public class Part_2 {

    public static void main(String[] args) {

        int difference = 0;

        for (String line: file.read_lines(args[0])) {
            difference += Matchsticks.calculate_encoded_length(line) - line.length();
        }

        System.out.println(difference);

    }

}