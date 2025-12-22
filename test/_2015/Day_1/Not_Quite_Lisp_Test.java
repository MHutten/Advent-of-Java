package test._2015.Day_1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import src._2015.Day_1.NeverEnteredBasementException;
import src._2015.Day_1.Not_Quite_Lisp;
import test.ReadInput;

public class Not_Quite_Lisp_Test {

    static String directions;

    @BeforeAll
    public static void setup() {
        directions = ReadInput.readInput("\\test\\_2015\\Day_1\\input.txt");
    }

    @Nested
    @DisplayName("Part 1")
    class Part1 {

        @Nested
        @DisplayName("Provided Examples")
        class ProvidedExamples {

            @Test
            @DisplayName("Directions which send Santa to floor 0")
            public void santaEndsAtFloor0() {
                assertAll(
                    () -> assertEquals(0, Not_Quite_Lisp.getSantasDestination("(())")),
                    () -> assertEquals(0, Not_Quite_Lisp.getSantasDestination("()()"))
                );
            }

            @Test
            @DisplayName("Directions which send Santa to floor 3")
            public void santaEndsAtFloor3() {
                assertAll(
                    () -> assertEquals(3, Not_Quite_Lisp.getSantasDestination("(((")),
                    () -> assertEquals(3, Not_Quite_Lisp.getSantasDestination("(()(()(")),
                    () -> assertEquals(3, Not_Quite_Lisp.getSantasDestination("))((((("))
                );
            }

            @Test
            @DisplayName("Directions which send Santa to floor -1")
            public void santaEndsAtBasementFloor1() {
                assertAll(
                    () -> assertEquals(-1, Not_Quite_Lisp.getSantasDestination("())")),
                    () -> assertEquals(-1, Not_Quite_Lisp.getSantasDestination("))("))
                );
            }

            @Test
            @DisplayName("Directions which send Santa to floor -3")
            public void santaEndsAtBasementFloor3() {
                assertAll(
                    () -> assertEquals(-3, Not_Quite_Lisp.getSantasDestination(")))")),
                    () -> assertEquals(-3, Not_Quite_Lisp.getSantasDestination(")())())"))
                );
            }
        }

        @Nested
        @DisplayName("Additional Cases")
        class AdditionalCases {

            @Test
            @DisplayName("Directions contain an unexpected character")
            public void santaReceivedIncorrectDirections() {
                IOException thrown = assertThrows(IOException.class, () -> Not_Quite_Lisp.getSantasDestination(">"));
                assertEquals("Invalid directions: contains character >", thrown.getMessage());
            }

            @Test
            @Disabled // TODO: print string of MAX_VALUE+1 ( characters to text file and here read text file
            public void santaWentTooHigh() {
                String directions = "";

                for (int i = -1; i < Integer.MAX_VALUE; i++) {
                    directions += '(';
                }

                final String INPUT = directions;

                ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> Not_Quite_Lisp.getSantasDestination(INPUT));
                System.out.println(thrown.getMessage());
                //assertEquals("Invalid directions: contains character >", thrown.getMessage());
            }

            @Test
            @Disabled
            public void santaWentTooLow() {
            }
        }

        @Test
        @DisplayName("Test on provided input")
        public void challenge() { 
            assertEquals(138, assertDoesNotThrow(() -> Not_Quite_Lisp.getSantasDestination(directions)));
        }
    }

    @Nested
    @DisplayName("Part 2")
    class Part2 {

        @Nested
        @DisplayName("Provided Examples")
        class ProvidedExamples {

            @Test
            @DisplayName("Directions where Santa enters the basement after the first direction")
            public void santaEntersBasementAfterFirstDirection() {
                assertEquals(1, assertDoesNotThrow(() -> Not_Quite_Lisp.santaEntersBasementAt(")")));
            }

            @Test
            @DisplayName("Directions where Santa enters the basement after the fifth direction")
            public void santaEntersBasementAfterFifthDirection() {
                assertEquals(5, assertDoesNotThrow(() -> Not_Quite_Lisp.santaEntersBasementAt("()())")));
            }
        }

        @Nested
        @DisplayName("Additional Cases")
        class AdditionalCases {

            @Test
            @DisplayName("Directions contain an unexpected character")
            public void santaReceivedIncorrectDirections() {
                IOException thrown = assertThrows(IOException.class, () -> Not_Quite_Lisp.santaEntersBasementAt(">"));
                assertEquals("Invalid directions: contains character >", thrown.getMessage());
            }

            @Test
            @DisplayName("Santa never enters the basement")
            public void santaNeverEntersBasement() {
                NeverEnteredBasementException thrown = assertThrows(NeverEnteredBasementException.class, () -> Not_Quite_Lisp.santaEntersBasementAt(""));
                assertEquals("Santa never entered the basement", thrown.getMessage());
            }
        }

        @Test
        @DisplayName("Test on provided input")
        public void challenge() {
            assertEquals(1771, assertDoesNotThrow(() -> Not_Quite_Lisp.santaEntersBasementAt(directions)));
        }
    }
}

