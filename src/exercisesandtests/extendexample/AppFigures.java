package exercisesandtests.extendexample;

public class AppFigures {
    public static void main(String tutu[]) {
        Square square = new Square(2, 2, "square");
        Figure rectangle = new Rectangle(2, 4, "rectangle");

        double area1 = square.calculateArea(square.getA(), square.getB());
        System.out.println(square.getDesc() + " area = " + area1);
        double area2 = rectangle.calculateArea(rectangle.getA(), rectangle.getB());
        System.out.println(area1);
    }
}
