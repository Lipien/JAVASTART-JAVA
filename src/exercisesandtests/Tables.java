package exercisesandtests;

public class Tables {
    public static void main(String[] args) {
        int[] table = new int[4];
        table[0] = 1;
        table[1] = 2;
        table[2] = 3;
        table[3] = 4;

        for(int i = 0; i<4; i++)
            System.out.println(table[i]);

        String test[] = {"test1", "test2", "test3"};

        for(int j = 0; j<3; j++)
            System.out.println(test[j]);
    }
}
