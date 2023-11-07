package src._2015.Day_2;

import java.util.Scanner;
import java.util.ArrayList;

public class I_Was_Told_There_Would_Be_No_Math {

    public static int getRequiredSquareFeetOfWrappingPaper(String listOfDimensions) {
        Scanner scanner = new Scanner(listOfDimensions);
        int squareFeetOfWrappingPaper = 0;

        while (scanner.hasNextLine()) {
            squareFeetOfWrappingPaper += getSquareFeetOfWrappingPaperForPresent(parseDimensionsString(scanner.nextLine()));
        }

        scanner.close();
        return squareFeetOfWrappingPaper;
    }

    private static ArrayList<Integer> parseDimensionsString(String boxDimensions) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (String dimension: boxDimensions.split("x")) {
            result.add(Integer.valueOf(dimension));
        }

        return result;
    }

    private static int getSquareFeetOfWrappingPaperForPresent(ArrayList<Integer> boxDimensions) {
        int l = boxDimensions.get(0);
        int w = boxDimensions.get(1);
        int h = boxDimensions.get(2);

        return 2*l*w + 2*w*h + 2*h*l + Math.min(Math.min(l*w, w*h), h*l);
    }
    
}
