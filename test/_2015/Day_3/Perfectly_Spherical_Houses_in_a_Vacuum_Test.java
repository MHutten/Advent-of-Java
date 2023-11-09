package test._2015.Day_3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import src._2015.Day_3.Deliverer;
import src._2015.Day_3.Perfectly_Spherical_Houses_in_a_Vacuum;
import test.ReadInput;

public class Perfectly_Spherical_Houses_in_a_Vacuum_Test {
    String directions;

    @Before
    public void setup() {
        directions = ReadInput.readInput("\\test\\_2015\\Day_3\\input.txt");
    }

    /* -------------------- Part 1 -------------------- */

    /* ---------- Provided Examples ---------- */

    @Test
    public void oneToTheRight() {
        Deliverer[] deliverers = {new Deliverer()};
        assertEquals(2, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited(">", deliverers));
    }

    @Test
    public void counterClockwiseCircle() {
        Deliverer[] deliverers = {new Deliverer()};
        assertEquals(4, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited("^>v<", deliverers));
    }

    @Test
    public void upAndDown5Times() {
        Deliverer[] deliverers = {new Deliverer()};
        assertEquals(2, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited("^v^v^v^v^v", deliverers));
    }

    /* ---------- Additional Cases ---------- */

    @Test
    @Ignore
    public void santaReceivedIncorrectDirections() {
    }

    @Test
    @Ignore
    public void santaIsTooFarNorth() {
        // TODO should throw exception when Y position exceeds maximum int
    }

    @Test
    @Ignore
    public void santaIsTooFarEast() {
        // TODO should throw exception when X position exceeds maximum int
    }

    @Test
    @Ignore
    public void santaIsTooFarSouth() {
        // TODO should throw exception when Y position exceeds minimum int
    }

    @Test
    @Ignore
    public void santaIsTooFarWest() {
        // TODO should throw exception when X position exceeds minimum int
    }

    @Test
    @Ignore
    public void tooManyPresents() {
        // TODO should throw exception when number of times house visited exceeds maximum int
    }

    /* ---------- Problem ---------- */

    @Test
    public void part1() {
        Deliverer[] deliverers = {new Deliverer()};
        assertEquals(2565, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited(directions, deliverers));
    }

    /* -------------------- Part 2 -------------------- */

    /* ---------- Provided Examples ---------- */

    @Test
    public void santaUpRoboDown() {
        Deliverer[] deliverers = {new Deliverer(), new Deliverer()};
        assertEquals(3, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited("^v", deliverers));
    }

    @Test
    public void santaUpDownRoboLeftRight() {
        Deliverer[] deliverers = {new Deliverer(), new Deliverer()};
        assertEquals(3, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited("^>v<", deliverers));
    }

    @Test
    public void santaUpRoboDown5Times() {
        Deliverer[] deliverers = {new Deliverer(), new Deliverer()};
        assertEquals(11, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited("^v^v^v^v^v", deliverers));
    }

    /* ---------- Additional Cases ---------- */

    @Test
    public void santaUsesASecondRobot() {
        Deliverer[] deliverers = {new Deliverer(), new Deliverer(), new Deliverer()};
        assertEquals(4, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited("^>v", deliverers));
    }

    /* ---------- Problem ---------- */

    @Test
    public void part2() {
        Deliverer[] deliverers = {new Deliverer(), new Deliverer()};
        assertEquals(2639, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited(directions, deliverers));
    }
}