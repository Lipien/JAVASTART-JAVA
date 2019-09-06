package exercisesandtests.kodillaexercise;

import java.util.function.Function;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        Function<String, String> textFunction = text -> text.toUpperCase().toUpperCase();
        String textForChange = "text";
        String changedText = textFunction.apply(textForChange);
        System.out.println(changedText);
    }
}
