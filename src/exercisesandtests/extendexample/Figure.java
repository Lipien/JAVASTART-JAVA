package exercisesandtests.extendexample;

public class Figure {

    private int a;
    private int b;

    public Figure() {
    }

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double calculateArea(int a, int b) {
        double area;
        area = a * b;
        return area;
    }
}
