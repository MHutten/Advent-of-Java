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

    public static void assert_equal(String first, String second) {

        if (!first.equals(second)) {
            throw new TestFailure(first + " != " + second);
        }

    }

}