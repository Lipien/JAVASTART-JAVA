package methodoverloading;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    int substract(int a, int b) {
        return b - a;
    }

    int substract(int a, int b, int c) {
        return c - b - a;
    }
}
