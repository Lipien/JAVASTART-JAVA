package collections.exercise2;

import java.util.Collections;
import java.util.List;

public class Lotto {

    private List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void numbersGenerator(List<Integer> numbers) {
        for (int i = 1; i < 50; i++) {
            numbers.add(i);
        }
    }

    public void randomize(List<Integer> numbers) {
        Collections.shuffle(numbers);
    }

    public int checkResult(List<Integer> userNumbers) {
        List<Integer> lottoResult = numbers.subList(0, 6);

        System.out.println("Wynik losowania: ");
        for (Integer num : lottoResult) {
            System.out.print(num + " ");
        }
        System.out.println();

        int found = 0;
        for (int i = 0; i < 6; i++) {
            if (lottoResult.contains(userNumbers.get(i))) {
                found++;
            }
        }
        return found;
    }
}