package methodsandconstructors;

public class Calculate {
    public static void main(String[] args) {
        double x = 3.4;
        double y = 29.1;

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(x, y));
        System.out.println(calculator.substract(x, y));
        System.out.println(calculator.multiply(x, y));
        System.out.println(calculator.divide(x, y));
    }
}
