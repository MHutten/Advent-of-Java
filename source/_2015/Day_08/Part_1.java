package advent_of_code._2015.Day_08;

import advent_of_code.file;

public class Part_1 {

    public static void main(String[] args) {

        int difference = 0;

        for (String line: file.read_lines(args[0])) {

            try {
                difference += line.length() - Matchsticks.calculate_memory_length(line);
            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }

        }

        System.out.println(difference);

    }

}