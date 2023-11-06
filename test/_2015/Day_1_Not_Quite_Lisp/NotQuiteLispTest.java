package test._2015.Day_1_Not_Quite_Lisp;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import src._2015.Day_1_Not_Quite_Lisp.NotQuiteLisp;
import test.ReadInput;

public class NotQuiteLispTest {

    String directions;

    @Before
    public void setup() {
        directions = ReadInput.readInput("\\test\\_2015\\Day_1_Not_Quite_Lisp\\input.txt");
    }

    /* -------------------- Part 1 -------------------- */

    /* ---------- Provided Examples ---------- */

    @Test
    public void santaEndsAtFloor0() {
        assertEquals(0, NotQuiteLisp.getSantasDestination("(())"));
        assertEquals(0, NotQuiteLisp.getSantasDestination("()()"));
    }

    @Test
    public void santaEndsAtFloor3() {
        assertEquals(3, NotQuiteLisp.getSantasDestination("((("));
        assertEquals(3, NotQuiteLisp.getSantasDestination("(()(()("));
        assertEquals(3, NotQuiteLisp.getSantasDestination("))((((("));
    }

    @Test
    public void santaEndsAtBasementFloor1() {
        assertEquals(-1, NotQuiteLisp.getSantasDestination("())"));
        assertEquals(-1, NotQuiteLisp.getSantasDestination("))("));
    }

    @Test
    public void santaEndsAtBasementFloor3() {
        assertEquals(-3, NotQuiteLisp.getSantasDestination(")))"));
        assertEquals(-3, NotQuiteLisp.getSantasDestination(")())())"));
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
        assertEquals(138, NotQuiteLisp.getSantasDestination(directions));
    }

    /* -------------------- Part 2 -------------------- */

    /* ---------- Provided Examples ---------- */

    @Test
    public void santaEntersBasementAfterFirstDirection() {
        assertEquals(1, NotQuiteLisp.santaEntersBasementAt(")"));
    }

    @Test
    public void santaEntersBasementAfterFifthDirection() {
        assertEquals(5, NotQuiteLisp.santaEntersBasementAt("()())"));
    }

    /* ---------- Additional Cases ---------- */

    @Test
    public void santaNeverEntersBasement() {
        assertEquals(0, NotQuiteLisp.santaEntersBasementAt("")); // TODO change so it tests for thrown exception
    }

    /* ---------- Problem ---------- */

    @Test
    public void part2() {
        assertEquals(1771, NotQuiteLisp.santaEntersBasementAt(directions));
    }
}

