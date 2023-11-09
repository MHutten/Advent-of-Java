package src._2015.Day_3;

import java.util.HashMap;
import java.util.Map;

public class Perfectly_Spherical_Houses_in_a_Vacuum { // TODO remove keeping track of how many presents are delivered in each house
    
    public static int getNumberOfHousesVisited(String directions, Deliverer[] deliverers) {
        Map<Integer[],Integer> visitedHouses = new HashMap<Integer[], Integer>() {{
            put(new Integer[] {0, 0}, deliverers.length);
        }};

        char[] directionsArray = directions.toCharArray();

        for (int i = 0; i < directionsArray.length; i++) {
            char direction = directionsArray[i];
            Deliverer deliverer = deliverers[i % deliverers.length];
            Integer[] delivererLocation = allignToHouseCoordinates(deliverer.followDirection(direction), visitedHouses);

            if (visitedHouses.containsKey(delivererLocation)) {
                visitedHouses.put(delivererLocation, visitedHouses.get(delivererLocation) + 1);
            } else {
                visitedHouses.put(delivererLocation, 1);
            }
        }

        return visitedHouses.size();
    }

    // This helps prevent problems with Keys with equal values still being different Objects
    private static Integer[] allignToHouseCoordinates(Integer[] currentLocation, Map<Integer[],Integer> visitedHouses) {

        for (Integer[] coordinate: visitedHouses.keySet()) {
            if (coordinate[0] == currentLocation[0] && coordinate[1] == currentLocation[1]) {
                return coordinate;
            }
        }

        return currentLocation;
    }
}
