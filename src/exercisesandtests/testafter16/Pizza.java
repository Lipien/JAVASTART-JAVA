package exercisesandtests.testafter16;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<String> ingredients;

    public static class PizzaBuilder {
        private List<String> ingredients = new ArrayList<>();

        public PizzaBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Pizza build() {
            return new Pizza(ingredients);
        }
    }

    public Pizza(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
