package exercisesandtests.methodreferenceexercise;

public class PoemApp {
    public static void main(String[] args) {
        String text = "TeXt";
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(text, x -> x.toUpperCase());
        poemBeautifier.beautify(text, String::toUpperCase);
    }
}
