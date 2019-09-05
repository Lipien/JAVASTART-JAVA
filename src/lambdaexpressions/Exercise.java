package lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Exercise {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        Random r = new Random();
        generate(ints, 10, () -> r.nextInt(1000));
        consumeList(ints, x -> System.out.print(x + " "));
    }

    private static <T> void generate(List<T> tenNumbers, int num, Supplier<T> sup) {
        for (int i = 0; i < num; i++) {
            tenNumbers.add(sup.get());
        }
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
