package methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NamesSort {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Adam", "Basia", "Tomek", "Natasza", "Sywia");

        name.sort(String::compareToIgnoreCase);
        name.forEach(System.out::println);
    }
}
