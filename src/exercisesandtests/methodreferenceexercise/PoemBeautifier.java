package exercisesandtests.methodreferenceexercise;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator){
        String decoratedText = poemDecorator.decorate(text);
        System.out.println(decoratedText);
    }
}
