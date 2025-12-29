package advent_of_code._2015.Day_10;

public class Part_2 {

    public static void main(String[] args) {

        String string = args[0];

        for (int iteration = 0; iteration < 50; iteration++) {
            try {
                string = Elves_Look_Elves_Say.look_and_say(string);
            } catch (Exception exception) {
                System.out.println(exception);
                throw new RuntimeException("Exception occurred");
            }
        }

        System.out.println(string.length());

    }

}