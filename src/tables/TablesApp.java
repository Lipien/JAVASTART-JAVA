package tables;

public class TablesApp {
    public static void main(String[] args) {

        int[] tableOne = new int[5];
        tableOne[0] = 1;
        tableOne[1] = 2;
        tableOne[2] = 3;
        tableOne[3] = 4;
        tableOne[4] = 5;

        int[] tableTwo = {6, 7, 8, 9, 10};

        int sum = tableOne[0] + tableTwo[0];

        System.out.println(sum);
    }
}
