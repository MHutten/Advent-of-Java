package test._2015.Day_1;

import advent_of_code._2015.Day_1.Not_Quite_Lisp;
import advent_of_code.testing.asserts;
import advent_of_code.testing.Test;
import advent_of_code.testing.TestSuite;

public class Not_Quite_Lisp_test extends TestSuite {

    @Test
    public static void test__calculate_santas_final_destination__good_weather__up_up_down_down() {
        asserts.assert_equal(Not_Quite_Lisp.calculate_santas_final_destination("(())"), 0);
    }

    @Test
    public static void test__calculate_santas_final_destination__good_weather__up_down_up_down() {
        asserts.assert_equal(Not_Quite_Lisp.calculate_santas_final_destination("()()"), 0);
    }

    @Test
    public static void test__calculate_santas_final_destination__good_weather__up_up_up() {
        asserts.assert_equal(Not_Quite_Lisp.calculate_santas_final_destination("((("), 3);
    }

    @Test
    public static void test__calculate_santas_final_destination__good_weather__up_up_down_up_up_down_up() {
        asserts.assert_equal(Not_Quite_Lisp.calculate_santas_final_destination("(()(()("), 3);
    }

    @Test
    public static void test__calculate_santas_final_destination__good_weather__down_down_up_up_up_up_up() {
        asserts.assert_equal(Not_Quite_Lisp.calculate_santas_final_destination("))((((("), 3);
    }

    @Test
    public static void test__calculate_santas_final_destination__good_weather__up_down_down() {
        asserts.assert_equal(Not_Quite_Lisp.calculate_santas_final_destination("())"), -1);
    }

    @Test
    public static void test__calculate_santas_final_destination__good_weather__down_down_up() {
        asserts.assert_equal(Not_Quite_Lisp.calculate_santas_final_destination("))("), -1);
    }

    @Test
    public static void test__calculate_santas_final_destination__good_weather___down_down_down() {
        asserts.assert_equal(Not_Quite_Lisp.calculate_santas_final_destination(")))"), -3);
    }

    @Test
    public static void test__calculate_santas_final_destination__good_weather__down_up_down_down_up_down_down() {
        asserts.assert_equal(Not_Quite_Lisp.calculate_santas_final_destination(")())())"), -3);
    }

    @Test
    public static void test__calculate_basement_entering_instruction_position__good_weather__down() {
        asserts.assert_equal(Not_Quite_Lisp.calculate_basement_entering_instruction_position(")"), 1);
    }

    @Test
    public static void test__calculate_basement_entering_instruction_position__good_weather__up_down_up_down_down() {
        asserts.assert_equal(Not_Quite_Lisp.calculate_basement_entering_instruction_position("()())"), 5);
    }
    
}