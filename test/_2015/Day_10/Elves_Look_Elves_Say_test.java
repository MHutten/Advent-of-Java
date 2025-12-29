package test._2015.Day_10;

import advent_of_code._2015.Day_10.Elves_Look_Elves_Say;
import advent_of_code.testing.asserts;
import advent_of_code.testing.Test;
import advent_of_code.testing.TestFailure;
import advent_of_code.testing.TestSuite;

public class Elves_Look_Elves_Say_test extends TestSuite {

    @Test
    public static void test__look_and_say__good_weather__1() {

        String string;

        try {
            string = Elves_Look_Elves_Say.look_and_say("1");
        } catch (Exception exception) {
            throw new TestFailure("Exception occurred");
        }

        asserts.assert_equal(string, "11");

    }

    @Test
    public static void test__look_and_say__good_weather__11() {

        String string;

        try {
            string = Elves_Look_Elves_Say.look_and_say("11");
        } catch (Exception exception) {
            throw new TestFailure("Exception occurred");
        }

        asserts.assert_equal(string, "21");

    }

    @Test
    public static void test__look_and_say__good_weather__21() {

        String string;

        try {
            string = Elves_Look_Elves_Say.look_and_say("21");
        } catch (Exception exception) {
            throw new TestFailure("Exception occurred");
        }

        asserts.assert_equal(string, "1211");

    }

    @Test
    public static void test__look_and_say__good_weather__1211() {

        String string;

        try {
            string = Elves_Look_Elves_Say.look_and_say("1211");
        } catch (Exception exception) {
            throw new TestFailure("Exception occurred");
        }

        asserts.assert_equal(string, "111221");

    }

    @Test
    public static void test__look_and_say__good_weather__111221() {

        String string;

        try {
            string = Elves_Look_Elves_Say.look_and_say("111221");
        } catch (Exception exception) {
            throw new TestFailure("Exception occurred");
        }

        asserts.assert_equal(string, "312211");

    }

}