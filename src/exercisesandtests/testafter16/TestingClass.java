package exercisesandtests.testafter16;

public class TestingClass {
}

interface Shape {
    default void draw() {
        System.out.println("drwawing any shape");
    }

    static void paint() {
        System.out.println("Painting in progress");
    }
}

class Triangle implements Shape {
    public void changeSize() {
        System.out.println("Scaling in progress");
    }

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape.paint();
    }
}