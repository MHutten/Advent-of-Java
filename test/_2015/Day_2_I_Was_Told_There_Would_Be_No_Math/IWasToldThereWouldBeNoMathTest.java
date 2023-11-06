package test._2015.Day_2_I_Was_Told_There_Would_Be_No_Math;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src._2015.Day_2_I_Was_Told_There_Would_Be_No_Math.IWasToldThereWouldBeNoMath;
import test.ReadInput;

public class IWasToldThereWouldBeNoMathTest {
    String listOfDimensions;

    @Before
    public void setup() {
        listOfDimensions = ReadInput.readInput("\\test\\_2015\\Day_2_I_Was_Told_There_Would_Be_No_Math\\input.txt");
    }

    /* -------------------- Part 1 -------------------- */

    /* ---------- Provided Examples ---------- */

    @Test
    public void presentOf2x3x4() {
        assertEquals(58, IWasToldThereWouldBeNoMath.getRequiredSquareFeetOfWrappingPaper("2x3x4"));
    }

    @Test
    public void presentOf1x1x10() {
        assertEquals(43, IWasToldThereWouldBeNoMath.getRequiredSquareFeetOfWrappingPaper("1x1x10"));
    }

    /* ---------- Additional Cases ---------- */

    /* ---------- Problem ---------- */

    @Test
    public void part1() {
        //System.out.println(listOfDimensions);
        assertEquals(1606483, IWasToldThereWouldBeNoMath.getRequiredSquareFeetOfWrappingPaper(listOfDimensions));
    }

    /* -------------------- Part 2 -------------------- */

    /* ---------- Provided Examples ---------- */

    /* ---------- Additional Cases ---------- */

    /* ---------- Problem ---------- */

    @Test
    public void part2() {
    }
}



