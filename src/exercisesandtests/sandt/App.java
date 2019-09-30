package exercisesandtests.sandt;

public class App {

    private static String str = null;

    public static void main(String[] args) {
        str = "Java Tests";
        for (int i = 0; i <= 3; i++) {
            if (i % 2 == 0) {
                str.concat("s");
                str.substring(str.length() - 1).toLowerCase();
            } else {
                str.concat("s");
                str.substring(str.length() - 1).toUpperCase();
            }
        }
        System.out.println(str);
    }
}
