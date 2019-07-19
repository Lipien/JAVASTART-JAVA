package javabeans;

import javabeans.javabeans1.PointController;
import javabeans.javabeans2.Point;

public class PointApplication {
    public static void main(String[] args) {

        PointController pointController = new PointController();
        Point p = new Point(10, 10);
        System.out.println("initial coordinates: " + p.getX() + " " + p.getY());

        pointController.addX(p);
        System.out.println("addX: " + p.getX() + " " + p.getY());

        pointController.addY(p);
        System.out.println("addY: " + p.getX() + " " + p.getY());

        pointController.minusX(p);
        System.out.println("minusX: " + p.getX() + " " + p.getY());

        pointController.minusY(p);
        System.out.println("minusY: " + p.getX() + " " + p.getY());

        final int a = 1;
        final int b = 2;
        final int c = 3;
        final int d = 4;

        int choice = 2;

        switch (choice) {
            case a:
                pointController.addX(p);
                System.out.println("addX: " + p.getX() + " " + p.getY());
                break;
            case b:
                pointController.addY(p);
                System.out.println("addY: " + p.getX() + " " + p.getY());
                break;
            case c:
                pointController.minusX(p);
                System.out.println("minusX: " + p.getX() + " " + p.getY());
                break;
            case d:
                pointController.minusY(p);
                System.out.println("minusY: " + p.getX() + " " + p.getY());
                break;
            default:
                System.out.println("Podano błędną wartość");
        }
    }
}
