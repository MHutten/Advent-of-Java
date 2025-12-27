package advent_of_code._2015.Day_6;

public class Lights {

    private boolean[][] lights;

    public Lights(boolean initial_state) {

        this.lights = new boolean[1000][1000];

        for (int i = 0; i < this.lights.length; i++) {

            for(int j = 0; j < this.lights[i].length; j++) {
                this.lights[i][j] = initial_state;
            }

        }

    }

    public void turn_on(int[] start, int[] end) {

        for (int i = start[0]; i < end[0] + 1; i++) {

            for (int j = start[1]; j < end[1] + 1; j++) {
                this.lights[i][j] = true;
            }

        }

    }

    public void toggle(int[] start, int[] end) {

        for (int i = start[0]; i < end[0] + 1; i++) {

            for (int j = start[1]; j < end[1] + 1; j++) {
                this.lights[i][j] = !this.lights[i][j];
            }

        }

    }

    public void turn_off(int[] start, int[] end) {

        for (int i = start[0]; i < end[0] + 1; i++) {

            for (int j = start[1]; j < end[1] + 1; j++) {
                this.lights[i][j] = false;
            }

        }

    }

    public int get_number_of_lit_lights() {

        int number_of_lit_lights = 0;

        for (int i = 0; i < this.lights.length; i++) {

            for (int j = 0; j < this.lights[i].length; j++) {
                
                if (this.lights[i][j]) {
                    number_of_lit_lights++;
                }

            }

        }

        return number_of_lit_lights;

    }

}