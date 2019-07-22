package scanner.app;

import scanner.calc.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Insert first number: ");
        double a = input.nextDouble();
        input.nextLine();
        System.out.println("Insert math operator: ");
        String operator = input.nextLine();
        System.out.println("Insert second number: ");
        double b = input.nextDouble();

        Calculator calculator = new Calculator();
        double result = calculator.calculate(a, b, operator);
        System.out.println(a + operator + b + " = " + result);

        input.close();
    }
}

