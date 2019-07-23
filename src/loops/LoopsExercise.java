package loops;

import java.util.Scanner;

public class LoopsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell how many numbers to input:");
        int input = scanner.nextInt();

        int xtimes = 0;
        int sum = 0;
        while (xtimes < input) {
            System.out.println("Insert number");
            int number = scanner.nextInt();
            ++xtimes;
            sum = sum + number;
        }
        System.out.println("Sum of all declared numbers: " + sum);
        scanner.close();
    }
}
