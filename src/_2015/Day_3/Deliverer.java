package src._2015.Day_3;

public class Deliverer {

    private Integer[] location = {0, 0};

    public Deliverer() {}

    public Integer[] followDirection(char direction) {

        switch (direction) {
            case '^':
                location[1]++;
                return new Integer[] {location[0], location[1]};
            case '>':
                location[0]++;
                return new Integer[] {location[0], location[1]};
            case 'v':
                location[1]--;
                return new Integer[] {location[0], location[1]};
            case '<':
                location[0]--;
                return new Integer[] {location[0], location[1]};
            default:
                return new Integer[] {0, 0}; // TODO throw exception
        }

    }
    
}
