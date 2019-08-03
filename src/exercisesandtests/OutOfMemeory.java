package exercisesandtests;

import java.util.ArrayList;

public class OutOfMemeory {
    public static void main(String[] args) {
        ArrayList<Integer> testNumbersCollection = new ArrayList<>();
        //activate commented code to get "java.lang.OutOfMemoryError: Java heap space"
        // testNumbersCollection.add(1);
        for (int i = 0; i < testNumbersCollection.size(); i++) {
            testNumbersCollection.add(i);
        }
    }
}

