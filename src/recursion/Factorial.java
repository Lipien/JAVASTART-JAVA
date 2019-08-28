package recursion;

public class Factorial {
    public static void main(String[] args) {
        int number = factorial(5);
        System.out.println(number);
    }

    static int factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
