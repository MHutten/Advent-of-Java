package test._2015.Day_1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import src._2015.Day_1.Not_Quite_Lisp;
import test.ReadInput;

public class Not_Quite_Lisp_Test {

    String directions;

    @Before
    public void setup() {
        directions = ReadInput.readInput("\\test\\_2015\\Day_1\\input.txt");
    }

    /* -------------------- Part 1 -------------------- */

    /* ---------- Provided Examples ---------- */

    @Test
    public void santaEndsAtFloor0() {
        assertEquals(0, Not_Quite_Lisp.getSantasDestination("(())"));
        assertEquals(0, Not_Quite_Lisp.getSantasDestination("()()"));
    }

    @Test
    public void santaEndsAtFloor3() {
        assertEquals(3, Not_Quite_Lisp.getSantasDestination("((("));
        assertEquals(3, Not_Quite_Lisp.getSantasDestination("(()(()("));
        assertEquals(3, Not_Quite_Lisp.getSantasDestination("))((((("));
    }

    @Test
    public void santaEndsAtBasementFloor1() {
        assertEquals(-1, Not_Quite_Lisp.getSantasDestination("())"));
        assertEquals(-1, Not_Quite_Lisp.getSantasDestination("))("));
    }

    @Test
    public void santaEndsAtBasementFloor3() {
        assertEquals(-3, Not_Quite_Lisp.getSantasDestination(")))"));
        assertEquals(-3, Not_Quite_Lisp.getSantasDestination(")())())"));
    }

    /* ---------- Additional Cases ---------- */

    @Test
    @Ignore
    public void santaReceivedIncorrectDirections() {
    }

    @Test
    @Ignore
    public void santaWentTooHigh() {
    }

    @Test
    @Ignore
    public void santaWentTooLow() {
    }

    /* ---------- Problem ---------- */

    @Test
    public void part1() {
        assertEquals(138, Not_Quite_Lisp.getSantasDestination(directions));
    }

    /* -------------------- Part 2 -------------------- */

    /* ---------- Provided Examples ---------- */

    @Test
    public void santaEntersBasementAfterFirstDirection() {
        assertEquals(1, Not_Quite_Lisp.santaEntersBasementAt(")"));
    }

    @Test
    public void santaEntersBasementAfterFifthDirection() {
        assertEquals(5, Not_Quite_Lisp.santaEntersBasementAt("()())"));
    }

    /* ---------- Additional Cases ---------- */

    @Test
    public void santaNeverEntersBasement() {
        assertEquals(0, Not_Quite_Lisp.santaEntersBasementAt("")); // TODO change so it tests for thrown exception
    }

    /* ---------- Problem ---------- */

    @Test
    public void part2() {
        assertEquals(1771, Not_Quite_Lisp.santaEntersBasementAt(directions));
    }
}

