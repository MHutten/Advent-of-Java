package advent_of_code._2015.Day_2;

import advent_of_code.file;

public class Part_1 {

    public static void main(String[] args) {

        int area_of_wrapping_paper = 0;

        for (String line: file.read_lines(args[0])) {

            String[] dimensions = line.split("x");
            area_of_wrapping_paper += I_Was_Told_There_Would_Be_No_Math.calculate_area_of_wrapping_paper(
                Integer.parseInt(dimensions[0]),
                Integer.parseInt(dimensions[1]),
                Integer.parseInt(dimensions[2])
            );

        }

        System.out.println(area_of_wrapping_paper);

    }

}