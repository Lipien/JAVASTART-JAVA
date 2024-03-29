package exercisesandtests;

public class Human {

    private String name;
    private double height;
    public static double avgHeight;

    public Human(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static double getAvgHeight() {
        return avgHeight;
    }

    public static void setAvgHeight(double avgHeight) {
        Human.avgHeight = avgHeight; //can access object directly, without "this"
    }
}
