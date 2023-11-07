package test._2015.Day_2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src._2015.Day_2.I_Was_Told_There_Would_Be_No_Math;
import test.ReadInput;

public class I_Was_Told_There_Would_Be_No_Math_Test {
    String listOfDimensions;

    @Before
    public void setup() {
        listOfDimensions = ReadInput.readInput("\\test\\_2015\\Day_2\\input.txt");
    }

    /* -------------------- Part 1 -------------------- */

    /* ---------- Provided Examples ---------- */

    @Test
    public void presentOf2x3x4() {
        assertEquals(58, I_Was_Told_There_Would_Be_No_Math.getRequiredSquareFeetOfWrappingPaper("2x3x4"));
    }

    @Test
    public void presentOf1x1x10() {
        assertEquals(43, I_Was_Told_There_Would_Be_No_Math.getRequiredSquareFeetOfWrappingPaper("1x1x10"));
    }

    /* ---------- Additional Cases ---------- */

    /* ---------- Problem ---------- */

    @Test
    public void part1() {
        assertEquals(1606483, I_Was_Told_There_Would_Be_No_Math.getRequiredSquareFeetOfWrappingPaper(listOfDimensions));
    }

    /* -------------------- Part 2 -------------------- */

    /* ---------- Provided Examples ---------- */

    /* ---------- Additional Cases ---------- */

    /* ---------- Problem ---------- */

    @Test
    public void part2() {
    }
}



