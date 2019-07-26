package algorithms;

import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int maxNumber = 100;
        int userInput;
        int sumGenerator = 0;
        System.out.println("Insert integer:");

        while ((userInput = scanner.nextInt()) <= maxNumber) {
            System.out.println("Insert integer:");
            sumGenerator = sumGenerator + userInput;
        }
        if (sumGenerator % 2 == 0)
            System.out.println("even");
        else System.out.println("uneven");

        System.out.println("Inserted number is too high!");
        scanner.close();
    }
}

