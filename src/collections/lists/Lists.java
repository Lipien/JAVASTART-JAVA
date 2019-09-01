package collections.lists;

import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        LinkedList<Double> ints = new LinkedList<>();

        for (double i = 0; i < 100; i++) {
            ints.add(i); // obiekty Integer, nie int!
        }

        System.out.println("ints.get(50) = " + ints.get(50));
        System.out.println("Ilość elementów na liście: " + ints.size());
        System.out.println("Czyszczę tablicę: ");
        ints.clear();
        System.out.println("Ilość elementów na liście: " + ints.size());
    }
}
