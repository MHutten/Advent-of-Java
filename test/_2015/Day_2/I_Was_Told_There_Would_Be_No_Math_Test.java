package test._2015.Day_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import src._2015.Day_2.I_Was_Told_There_Would_Be_No_Math;
import test.ReadInput;

public class I_Was_Told_There_Would_Be_No_Math_Test {
    static String listOfDimensions;

    @BeforeAll
    public static void setup() {
        listOfDimensions = ReadInput.readInput("\\test\\_2015\\Day_2\\input.txt");
    }

    @Nested
    @DisplayName("Part 1")
    class Part1 {

        @Nested
        @DisplayName("Provided Examples")
        class ProvidedExamples {

            @Test
            @DisplayName("A present with dimensions 2x3x4 requires 58 square feet of wrapping paper")
            public void presentOf2x3x4() {
                assertEquals(58, I_Was_Told_There_Would_Be_No_Math.getRequiredSquareFeetOfWrappingPaper("2x3x4"));
            }

            @Test
            @DisplayName("A present with dimensions 1x1x10 requires 43 square feet of wrapping paper")
            public void presentOf1x1x10() {
                assertEquals(43, I_Was_Told_There_Would_Be_No_Math.getRequiredSquareFeetOfWrappingPaper("1x1x10"));
            }
        }

        @Nested
        @DisplayName("Additional Cases")
        class AdditionalCases {
            
            @Test
            @Disabled
            public void presentWithNegativeDimensions() {
                // TODO should throw exception since negative dimensions are not realistic
            }

            @Test
            @Disabled
            public void presentTooLarge() {
                // TODO should throw exception when required amount of wrapping paper exceeds max int
            }

            @Test
            @Disabled
            public void thatIsNotANumber() {
                // TODO should throw exception when there is a character other than x or a number
            }

            @Test
            @Disabled
            public void aDimensionIsMissing() {
                // TODO should throw exception when a dimensions is missing
            }
        }

        @Test
        @DisplayName("Test on provided input")
        public void challenge() {
            assertEquals(1606483, I_Was_Told_There_Would_Be_No_Math.getRequiredSquareFeetOfWrappingPaper(listOfDimensions));
        }
    }

    @Nested
    @DisplayName("Part 2")
    class Part2 {

        @Nested
        @DisplayName("Provided Examples")
        class ProvidedExamples {

            @Test
            @DisplayName("A present with dimensions 2x3x4 requires a 34 feet long ribbon")
            public void ribbonForPresentOf2x3x4() {
                assertEquals(34, I_Was_Told_There_Would_Be_No_Math.getRequiredFeetOfRibbon("2x3x4"));
            }

            @Test
            @DisplayName("A present with dimensions 1x1x10 requires a 14 feet long ribbon")
            public void ribbonForPresentOf1x1x10() {
                assertEquals(14, I_Was_Told_There_Would_Be_No_Math.getRequiredFeetOfRibbon("1x1x10"));
            }
        }

        @Nested
        @DisplayName("Additional Cases")
        class AdditionalCases {

            @Test
            @Disabled
            public void ribbonTooLong() {
                // TODO should throw exception when required amount of ribbon exceeds max int
            }
        }

        @Test
        @DisplayName("Test on provided input")
        public void challenge() {
            assertEquals(3842356, I_Was_Told_There_Would_Be_No_Math.getRequiredFeetOfRibbon(listOfDimensions));
        }
    }
}



