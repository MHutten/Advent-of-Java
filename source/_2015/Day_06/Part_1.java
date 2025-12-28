package advent_of_code._2015.Day_06;

import advent_of_code.file;

public class Part_1 {

    public static void main(String[] args) {

        Lights lights = new Lights(false);

        for (String line: file.read_lines(args[0])) {

            Operation operation = Probably_a_Fire_Hazard.parse_operation_string(line);

            if (operation.operation.equals("on")) {
                lights.turn_on(operation.start, operation.end);
            } else if (operation.operation.equals("toggle")) {
                lights.toggle(operation.start, operation.end);
            } else {
                lights.turn_off(operation.start, operation.end);
            }
            
        }

        System.out.println(lights.get_number_of_lit_lights());

    }

}