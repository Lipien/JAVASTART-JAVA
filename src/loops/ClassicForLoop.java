package loops;

public class ClassicForLoop {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = a + 1;
        }
        for (int a = 0; a < numbers.length; a++) {
            System.out.println("Number: " + numbers[a]);
        }
    }
}