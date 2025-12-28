package advent_of_code.testing;

public class asserts {

    public static void assert_true(boolean bool) {

        if (!bool) {
            throw new TestFailure(bool + " is false");
        }

    }

    public static void assert_false(boolean bool) {

        if (bool) {
            throw new TestFailure(bool + " is true");
        }

    }

    public static void assert_equal(int first, int second) {

        if (first != second) {
            throw new TestFailure(first + " != " + second);
        }

    }

}