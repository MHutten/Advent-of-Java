package advent_of_code.testing;

public class asserts {

    public static void assert_equal(int first, int second) {

        if (first != second) {
            throw new TestFailure(first + " != " + second);
        }

    }

}