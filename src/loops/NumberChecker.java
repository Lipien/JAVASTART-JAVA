package loops;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp;
        for (int a = 0; a < 3; a++) {
            System.out.println("Insert numbers for check: ");
            temp = scanner.nextInt();

            if (temp % 2 == 0) {
                System.out.println("Number " + temp + " is even");
            } else {
                System.out.println("Number " + temp + " is uneven");
            }
        }
        scanner.close();
    }
}
