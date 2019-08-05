package exercisesandtests;

public class StringBuilderTests {
    public static void main(String[] args) {
        StringBuilder mateyMessage = new StringBuilder("Shivers!");
        System.out.println(mateyMessage.append(" Bad Storm!"));

        mateyMessage = new StringBuilder("Shiver Me Tim!");
        System.out.println(mateyMessage);
        System.out.println(mateyMessage.insert(13, "bers and Bricks"));

        mateyMessage = new StringBuilder("Shiver Me Timbers!");
        System.out.println(mateyMessage.deleteCharAt(17));

        String eggs1 = "Cackle fruit";
        String eggs2 = "Cackle fruits";
        System.out.println(eggs1.compareTo(eggs2));
    }
}
