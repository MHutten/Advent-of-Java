package advent_of_code.testing;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestSuite {

    public void main(String[] args) {
        run();
    }

    public void run() {

        for (Method method : this.getClass().getDeclaredMethods()) {

            if (method.isAnnotationPresent(Test.class)) {
                try {
                    method.invoke(this);
                    System.out.println(method.getName() + ": PASS");
                } catch (Exception exception) {
                    System.out.println(method.getName() + ": FAIL");
                }
            }

        }

    }

}