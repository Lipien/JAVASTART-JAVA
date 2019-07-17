package operators;

import java.util.Random;

public class MathOperators {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(100);
        int y = randomGenerator.nextInt(100);
        boolean result;

        result = x > y;
        System.out.println("x > y = " + result);

        result = x * 2 > y;
        System.out.println("x * 2 > y = " + result);

        result = y < (x + 3) && y > x - 2;
        System.out.println("y < (x + 3) && y > x - 2 = " + result);

        result = ((x * y % 2) == 0);
        System.out.println("Czy x*y jest parzyste?: " + result);
    }
}
