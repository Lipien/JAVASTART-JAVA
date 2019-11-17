package exercisesandtests.testafter16;

import java.util.List;
import java.util.stream.Collectors;

public class OddAndEven {

    public List<Integer> exterminate(List<Integer> numbers) {
        return numbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }
}
