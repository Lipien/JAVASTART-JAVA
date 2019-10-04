package exercisesandtests;

import java.util.*;

public class TwoArraysAsSet {

    public static void main(String[] args) {
        String[] nazwy1 = {"Jeden", "Dwa", "Trzy"};
        String[] nazwy2 = {"Cztery", "Piec", "Jeden"};
        SortedSet<String> nazwy1a = new TreeSet<>(Arrays.asList(nazwy1));
        SortedSet<String> nazwy1b = new TreeSet<>(Arrays.asList(nazwy2));
        SortedSet<String> combined = new TreeSet<>(nazwy1b);
        combined.addAll(nazwy1a);
        for (String n : combined) {
            System.out.println(n);
        }
    }
}
