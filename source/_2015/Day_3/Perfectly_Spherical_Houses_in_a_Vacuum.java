package advent_of_code._2015.Day_3;

import java.util.ArrayList;

public class Perfectly_Spherical_Houses_in_a_Vacuum {

    private static void update_location(int[] location, char instruction) {

        if (instruction == '^') {
            location[1]++;
        } else if (instruction == 'v') {
            location[1]--;
        } else if (instruction == '>') {
            location[0]++;
        } else {
            location[0]--;
        }

    }

    private static boolean location_visited_before(ArrayList<int[]> visited_houses, int[] location) {

        for (int[] house_location: visited_houses) {

            if (house_location[0] == location[0] && house_location[1] == location[1]) {
                return true;
            }

        }

        return false;

    }

    public static int calculate_number_of_visited_houses(String instructions) {

        ArrayList<int[]> visited_houses = new ArrayList<int[]>();
        int[] location = {0, 0};
        visited_houses.add(location.clone());
        
        for (char instruction: instructions.toCharArray()) {

            update_location(location, instruction);

            if (!location_visited_before(visited_houses, location)) {
                visited_houses.add(location.clone());
            }

        }

        return visited_houses.size();

    }

    public static int calculate_number_of_visited_houses_with_robo_santa(String instructions) {

        ArrayList<int[]> visited_houses = new ArrayList<int[]>();
        int[] santas_current_location = {0, 0};
        int[] robo_current_location = {0, 0};
        visited_houses.add(santas_current_location.clone());
        boolean it_is_santas_turn = true;

        for (char instruction: instructions.toCharArray()) {

            if (it_is_santas_turn) {
                
                update_location(santas_current_location, instruction);

                if (!location_visited_before(visited_houses, santas_current_location)) {
                    visited_houses.add(santas_current_location.clone());
                }

            } else {

                update_location(robo_current_location, instruction);

                if (!location_visited_before(visited_houses, robo_current_location)) {
                    visited_houses.add(robo_current_location.clone());
                }

            }

            it_is_santas_turn = !it_is_santas_turn;

        }

        return visited_houses.size();

    }

}