package classstring;

import java.util.Locale;
import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Ile wyrazów wprowadzasz?");
        int numberOfWords = input.nextInt();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("Wpisz wyraz: ");
            String j = input.next();
            int wordLenght = j.length();
            builder.append(j.charAt(wordLenght - 1));
        }

        String word = builder.toString();
        System.out.println("Nowe słowo: " + word);
        input.close();
    }
}

