package _2015.Day_1_Not_Quite_Lisp;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class NotQuiteLispTest {

    String directions;
    int destination;

    public String readInput() {
        try {
            File file = new File("/input.txt");// TODO FIX, cannot find file
            Scanner scanner = new Scanner(file);
            String output = "";
            while (scanner.hasNextLine()) {
                output += scanner.nextLine();
            }
            scanner.close();
            return output;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return "";
        }
    }

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

    @Test
    public void part1() {
        directions = readInput();
        System.out.println(directions);
        destination = NotQuiteLisp.getSantasDestination(directions);
        assertEquals(138, destination);
    }
}

