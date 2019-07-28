package statementsuper;

public class Apple extends Fruit {

    private String fruitType;

    public Apple(String fruitType) {
        this.fruitType = fruitType;
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    @Override
    public void printInfo() {
        System.out.println("Owoc: " + fruitType);
    }
}
