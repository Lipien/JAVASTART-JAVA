package debugger;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAdder {
    public static void main(String[] args) {
        int[] array = createEvenArray(5);
        int[] revesedArray = reverseArray(array);
        System.out.println(Arrays.toString(revesedArray));
    }

    /**
     * @param size - number of elements to read
     * @return array containing even numbers
     */
    private static int[] createEvenArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            System.out.println("Podaj kolejną liczbę:");
            int next = scanner.nextInt();
            if (isEven(next)) {
                result[i] = next;
            } else {
                System.out.println("Podaj liczbę parzystą");
                next = result[i--];
            }
        }
        return result;
    }

    /**
     * @param number - number to be checked
     * @return true if number is even, or false otherwise
     */
    private static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array - array to be reversed
     * @return - reversed array
     */
    private static int[] reverseArray(int[] array) {
        int size = array.length;
        int[] reversed = new int[array.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[size - 1] = array[i];
            size--;
        }
        return reversed;
    }
}
