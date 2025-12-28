package advent_of_code._2015.Day_02;

import advent_of_code.file;

public class Part_2 {

    public static void main(String[] args) {

        int ribbon_length = 0;

        for (String line: file.read_lines(args[0])) {

            String[] dimensions = line.split("x");
            ribbon_length += I_Was_Told_There_Would_Be_No_Math.calculate_ribbon_length(
                Integer.parseInt(dimensions[0]),
                Integer.parseInt(dimensions[1]),
                Integer.parseInt(dimensions[2])
            );

        }

        System.out.println(ribbon_length);

    }

}