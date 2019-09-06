package collections.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Lotto lotto = new Lotto(numbers);
        lotto.numbersGenerator(numbers);
        lotto.randomize(numbers);
        List<Integer> userNumbers = new ArrayList<>();

        System.out.println("Witamy w losowaniu Lotto! Podaj swoje typy.");
        try (Scanner sc = new Scanner(System.in);) {
            int numbersUser = 6;
            while (numbersUser > 0) {
                System.out.println("Podaj kolejną liczbę:");
                userNumbers.add(sc.nextInt());
                sc.nextLine();
                numbersUser--;
            }
        }

        int found = lotto.checkResult(userNumbers);
        System.out.println("Trafione liczby: " + found);
    }
}
