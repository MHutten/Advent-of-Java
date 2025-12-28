package test._2015.Day_08;

import advent_of_code._2015.Day_08.Matchsticks;
import advent_of_code.testing.asserts;
import advent_of_code.testing.Test;
import advent_of_code.testing.TestFailure;
import advent_of_code.testing.TestSuite;

public class Matchsticks_test extends TestSuite {

    @Test
    public static void test__calculate_memory_length__good_weather__quote_quote() {

        int length;

        try {
            length = Matchsticks.calculate_memory_length("\"\"");
        } catch (Exception exception) {
            throw new TestFailure("Exception occurred");
        }

        asserts.assert_equal(length, 0);

    }

    @Test
    public static void test__calculate_memory_length__good_weather__quote_abc_quote() {

        int length;

        try {
            length = Matchsticks.calculate_memory_length("\"abc\"");
        } catch (Exception exception) {
            throw new TestFailure("Exception occurred");
        }

        asserts.assert_equal(length, 3);

    }

    @Test
    public static void test__calculate_memory_length__good_weather__quote_aaa_backslash_quote_aaa_quote() {

        int length;

        try {
            length = Matchsticks.calculate_memory_length("\"aaa\\\"aaa\"");
        } catch (Exception exception) {
            throw new TestFailure("Exception occurred");
        }

        asserts.assert_equal(length, 7);

    }

    @Test
    public static void test__calculate_memory_length__good_weather__quote_backslash_x27_quote() {

        int length;

        try {
            length = Matchsticks.calculate_memory_length("\"\\x27\"");
        } catch (Exception exception) {
            throw new TestFailure("Exception occurred");
        }

        asserts.assert_equal(length, 1);
    
    }

    @Test
    public static void test__calculate_encoded_length__good_weather__quote_quote() {

        int length;

        try {
            length = Matchsticks.calculate_encoded_length("\"\"");
        } catch (Exception exception) {
            throw new TestFailure("Exception occurred");
        }

        asserts.assert_equal(length, 6);
        
    }

    @Test
    public static void test__calculate_encoded_length__good_weather__quote_abc_quote() {

        int length;

        try {
            length = Matchsticks.calculate_encoded_length("\"abc\"");
        } catch (Exception exception) {
            throw new TestFailure("Exception occurred");
        }

        asserts.assert_equal(length, 9);
        
    }

    @Test
    public static void test__calculate_encoded_length__good_weather__quote_aaa_backslash_quote_aaa_quote() {

        int length;

        try {
            length = Matchsticks.calculate_encoded_length("\"aaa\\\"aaa\"");
        } catch (Exception exception) {
            throw new TestFailure("Exception occurred");
        }

        asserts.assert_equal(length, 16);
        
    }

    @Test
    public static void test__calculate_encoded_length__good_weather__quote_backslash_x27_quote() {

        int length;

        try {
            length = Matchsticks.calculate_encoded_length("\"\\x27\"");
        } catch (Exception exception) {
            throw new TestFailure("Exception occurred");
        }

        asserts.assert_equal(length, 11);
        
    }

}