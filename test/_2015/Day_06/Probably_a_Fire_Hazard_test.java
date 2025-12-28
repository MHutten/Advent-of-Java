package test._2015.Day_06;

import advent_of_code._2015.Day_06.Lights;
import advent_of_code._2015.Day_06.LightsWithBrightnessControls;
import advent_of_code.testing.asserts;
import advent_of_code.testing.Test;
import advent_of_code.testing.TestSuite;

public class Probably_a_Fire_Hazard_test extends TestSuite {

    @Test
    public static void test__turn_on__good_weather__0_0_trough_999_999() {

        Lights lights = new Lights(false);

        lights.turn_on(
            new int[]{0, 0},
            new int[]{999, 999}
        );

        asserts.assert_equal(lights.get_number_of_lit_lights(), 1000000);

        for (int i = 0; i < 1000; i++) {

            for (int j = 0; j < 1000; j++) {
                asserts.assert_true(lights.get_light(i, j));
            }

        }

    }

    @Test
    public static void test__toggle__good_weather__0_0_trough_999_0() {

        Lights lights = new Lights(false);

        for (int index = 0; index < 1000; index++) {

            if (index % 2 == 0) {
                lights.set_light(index, 0, true);
            }

        }

        lights.toggle(
            new int[]{0, 0},
            new int[]{999, 0}
        );

        asserts.assert_equal(lights.get_number_of_lit_lights(), 500);

        for (int i = 0; i < 1000; i++) {

            if (i % 2 == 0) {
                asserts.assert_false(lights.get_light(i, 0));
            } else {
                asserts.assert_true(lights.get_light(i, 0));
            }

            for (int j = 1; j < 1000; j++) {
                asserts.assert_false(lights.get_light(i, j));
            }
            
        }

    }

    @Test
    public static void test__turn_off__good_weather__499_499_through_500_500() {

        Lights lights = new Lights(true);

        lights.turn_off(
            new int[]{499, 499},
            new int[]{500, 500}
        );

        asserts.assert_equal(lights.get_number_of_lit_lights(), 999996);

        for (int i = 0; i < 1000; i++) {

            for (int j = 0; j < 1000; j++) {

                if (i >= 499 && i <= 500 && j >= 499 && j <= 500) {
                    asserts.assert_false(lights.get_light(i, j));
                } else {
                    asserts.assert_true(lights.get_light(i, j));
                }

            }

        }

    }

    @Test
    public static void test__turn_on_ancient_nordic_elvish__good_weather__0_0_trough_0_0() {

        LightsWithBrightnessControls lights = new LightsWithBrightnessControls(0);

        lights.turn_on_ancient_nordic_elvish(
            new int[]{0, 0},
            new int[]{0, 0}
        );

        asserts.assert_equal(lights.calculate_total_brightness(), 1);
        
        for (int i = 0; i < 1000; i++) {

            for (int j = 0; j < 1000; j++) {

                if (i == 0 && j == 0) {
                    asserts.assert_equal(lights.get_light(i, j), 1);
                } else {
                    asserts.assert_equal(lights.get_light(i, j), 0);
                }

            }

        }

    }

    @Test
    public static void test__toggle_ancient_nordic_elvish__good_weather__0_0_trough_999_999() {

        LightsWithBrightnessControls lights = new LightsWithBrightnessControls(0);

        lights.toggle_ancient_nordic_elvish(
            new int[]{0, 0},
            new int[]{999, 999}
        );

        asserts.assert_equal(lights.calculate_total_brightness(), 2000000);

        for (int i = 0; i < 1000; i++) {

            for (int j = 0; j < 1000; j++) {
                asserts.assert_equal(lights.get_light(i, j), 2);
            }

        }

    }

}