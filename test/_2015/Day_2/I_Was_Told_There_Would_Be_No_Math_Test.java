package test._2015.Day_2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
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

    @Test
    @Ignore
    public void presentWithNegativeDimensions() {
        // TODO should throw exception since negative dimensions are not realistic
    }

    @Test
    @Ignore
    public void presentTooLarge() {
        // TODO should throw exception when required amount of wrapping paper exceeds max int
    }

    @Test
    @Ignore
    public void thatIsNotANumber() {
        // TODO should throw exception when there is a character other than x or a number
    }

    @Test
    @Ignore
    public void aDimensionIsMissing() {
        // TODO should throw exception when a dimensions is missing
    }

    /* ---------- Problem ---------- */

    @Test
    public void part1() {
        assertEquals(1606483, I_Was_Told_There_Would_Be_No_Math.getRequiredSquareFeetOfWrappingPaper(listOfDimensions));
    }

    /* -------------------- Part 2 -------------------- */

    /* ---------- Provided Examples ---------- */

    @Test
    public void ribbonForPresentOf2x3x4() {
        assertEquals(34, I_Was_Told_There_Would_Be_No_Math.getRequiredFeetOfRibbon("2x3x4"));
    }

    @Test
    public void ribbonForPresentOf1x1x10() {
        assertEquals(14, I_Was_Told_There_Would_Be_No_Math.getRequiredFeetOfRibbon("1x1x10"));
    }

    /* ---------- Additional Cases ---------- */

    @Test
    @Ignore
    public void ribbonTooLong() {
        // TODO should throw exception when required amount of ribbon exceeds max int
    }

    /* ---------- Problem ---------- */

    @Test
    public void part2() {
        assertEquals(3842356, I_Was_Told_There_Would_Be_No_Math.getRequiredFeetOfRibbon(listOfDimensions));
    }
}



