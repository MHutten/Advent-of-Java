package test._2015.Day_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import src._2015.Day_3.Deliverer;
import src._2015.Day_3.Perfectly_Spherical_Houses_in_a_Vacuum;
import test.ReadInput;

public class Perfectly_Spherical_Houses_in_a_Vacuum_Test {
    static String directions;
    Deliverer santa;
    Deliverer[] deliverers;

    @BeforeAll
    public static void setup() {
        directions = ReadInput.readInput("\\test\\_2015\\Day_3\\input.txt");
    }

    @BeforeEach
    public void initDeliverers() {
        santa = new Deliverer();
    }

    @Nested
    @DisplayName("Part 1")
    class Part1 {

        @BeforeEach
        public void initDeliverers() {
            deliverers = new Deliverer[] {santa};
        }

        @Nested
        @DisplayName("Provided Examples")
        class ProvidedExamples {

            @Test
            @DisplayName("Santa moves east")
            public void oneToTheEast() {
                assertEquals(2, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited(">", deliverers));
            }

            @Test
            @DisplayName("Santa moves counterclockwise")
            public void counterClockwiseCircle() {
                assertEquals(4, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited("^>v<", deliverers));
            }

            @Test
            @DisplayName("Santa moves north then south 5 times")
            public void northAndSouth5Times() {
                assertEquals(2, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited("^v^v^v^v^v", deliverers));
            }
        }

        @Nested
        @DisplayName("Additional Cases")
        class AdditionalCases {

            @Test
            @Disabled
            public void santaReceivedIncorrectDirections() {
            }

            @Test
            @Disabled
            public void santaIsTooFarNorth() {
                // TODO should throw exception when Y position exceeds maximum int
            }

            @Test
            @Disabled
            public void santaIsTooFarEast() {
                // TODO should throw exception when X position exceeds maximum int
            }

            @Test
            @Disabled
            public void santaIsTooFarSouth() {
                // TODO should throw exception when Y position exceeds minimum int
            }

            @Test
            @Disabled
            public void santaIsTooFarWest() {
                // TODO should throw exception when X position exceeds minimum int
            }

            @Test
            @Disabled
            public void tooManyPresents() {
                // TODO should throw exception when number of times house visited exceeds maximum int
            }
        }

        @Test
        @DisplayName("Test on provided input")
        public void challenge() {
            assertEquals(2565, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited(directions, deliverers));
        }
    }

    @Nested
    @DisplayName("Part 2")
    class Part2 {
        Deliverer roboSanta;

        @BeforeEach
        public void initDeliverers() {
            roboSanta = new Deliverer();
            deliverers = new Deliverer[] {santa, roboSanta};
        }

        @Nested
        @DisplayName("Provided Examples")
        class ProvidedExamples {

            @Test
            @DisplayName("Santa moves north and Robo-Santa moves south")
            public void santaNorthRoboSouth() {
                assertEquals(3, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited("^v", deliverers));
            }

            @Test
            @DisplayName("Santa moves north then south and Robo-Santa moves west then east")
            public void santaNorthSouthRoboWestEast() {
                assertEquals(3, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited("^>v<", deliverers));
            }

            @Test
            @DisplayName("Santa moves north 5 times and Robo-Santa moves south 5 times")
            public void santaNorthRoboSouth5Times() {
                assertEquals(11, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited("^v^v^v^v^v", deliverers));
            }
        }

        @Nested
        @DisplayName("Additional Cases")
        class AdditionalCases {

            @Test
            @DisplayName("What if Santa uses a second robot?")
            public void santaUsesASecondRobot() {
                Deliverer roboSanta2 = new Deliverer();
                deliverers = new Deliverer[] {santa, roboSanta, roboSanta2};
                assertEquals(4, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited("^>v", deliverers));
            }
        }

        @Test
        @DisplayName("Test on provided input")
        public void challenge() {
            assertEquals(2639, Perfectly_Spherical_Houses_in_a_Vacuum.getNumberOfHousesVisited(directions, deliverers));
        }
    }
}