package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfNumbers {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);

        List<Integer> numbers = numStream.filter(x -> x > 100 && x < 1000)
                .filter(x -> x % 5 == 0)
                .limit(10)
                .map(x -> x * 3)
                .collect(Collectors.toList());

        numbers.forEach(System.out::println);
    }
}
