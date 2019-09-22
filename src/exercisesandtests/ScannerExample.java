package exercisesandtests;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write something on keyboard");
        String keyboard = input.nextLine();

        input.close();

        System.out.println(keyboard);
    }
}
