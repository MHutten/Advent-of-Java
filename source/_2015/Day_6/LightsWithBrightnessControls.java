package advent_of_code._2015.Day_6;

public class LightsWithBrightnessControls {

    private int[][] lights;

    public LightsWithBrightnessControls(int initial_state) {

        this.lights = new int[1000][1000];

        for (int i = 0; i < this.lights.length; i++) {

            for(int j = 0; j < this.lights[i].length; j++) {
                this.lights[i][j] = initial_state;
            }

        }

    }

    public void turn_on_ancient_nordic_elvish(int[] start, int[] end) {

        for (int i = start[0]; i < end[0] + 1; i++) {

            for (int j = start[1]; j < end[1] + 1; j++) {
                this.lights[i][j]++;
            }

        }

    }

    public void toggle_ancient_nordic_elvish(int[] start, int[] end) {

        for (int i = start[0]; i < end[0] + 1; i++) {

            for (int j = start[1]; j < end[1] + 1; j++) {
                this.lights[i][j] += 2;
            }

        }

    }

    public void turn_off_ancient_nordic_elvish(int[] start, int[] end) {

        for (int i = start[0]; i < end[0] + 1; i++) {

            for (int j = start[1]; j < end[1] + 1; j++) {

                if (this.lights[i][j] > 0) {
                    this.lights[i][j]--;
                }
                
            }

        }

    }

    public int calculate_total_brightness() {

        int brightness = 0;

        for (int i = 0; i < this.lights.length; i++) {

            for (int j = 0; j < this.lights[i].length; j++) {
                brightness += this.lights[i][j];
            }

        }

        return brightness;

    }

}