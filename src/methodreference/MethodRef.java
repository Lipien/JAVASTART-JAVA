package methodreference;

import java.util.Arrays;
import java.util.function.Consumer;

public class MethodRef {
    public static void main(String[] args) {
        String[] names = {"Kowalski", "Abacki", "Wojnarek", "Bednarek", "Krzywousty"};
        Arrays.sort(names, MethodRef::sortAscending);
        consumeArray(names, System.out::println);

        System.out.println(">>>");
        Arrays.sort(names, MethodRef::sortDescending);
        consumeArray(names, System.out::println);
    }

    private static <T> void consumeArray(T[] arr, Consumer<T> consumer) {
        for (T t : arr) {
            consumer.accept(t);
        }
    }

    private static int sortAscending(String t1, String t2) {
        return t1.compareTo(t2);
    }

    private static int sortDescending(String t1, String t2) {
        return t2.compareTo(t1);
    }
}
