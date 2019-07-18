package methodoverloading;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result2 = calculator.add(2, 3);
        int result3 = calculator.substract(10, 5, 2);

        System.out.println(result2);
        System.out.println(result3);
    }
}
