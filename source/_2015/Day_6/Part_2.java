package advent_of_code._2015.Day_6;

import advent_of_code.file;

public class Part_2 {

    public static void main(String[] args) {

        LightsWithBrightnessControls lights = new LightsWithBrightnessControls(0);

        for (String line: file.read_lines(args[0])) {

            Operation operation = Probably_a_Fire_Hazard.parse_operation_string(line);

            if (operation.operation.equals("on")) {
                lights.turn_on_ancient_nordic_elvish(operation.start, operation.end);
            } else if (operation.operation.equals("toggle")) {
                lights.toggle_ancient_nordic_elvish(operation.start, operation.end);
            } else {
                lights.turn_off_ancient_nordic_elvish(operation.start, operation.end);
            }
            
        }

        System.out.println(lights.calculate_total_brightness());

    }

}