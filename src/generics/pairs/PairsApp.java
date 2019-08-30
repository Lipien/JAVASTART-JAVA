package generics.pairs;

public class PairsApp {
    public static void main(String[] args) {
        Pairs p1 = new Pairs(2, 8);
        Pairs p2 = new Pairs(20.5, 31.7);
        Pairs<String, String> p3 = new Pairs<>("Jan", "Kowalski");

        printPair(p1);
        printPair(p2);
        printPair(p3);
    }

    static <T, V> void printPair(Pairs<T, V> pair) {
        System.out.println("<" + pair.getT() + " ; " + pair.getV() + ">");
    }
}
