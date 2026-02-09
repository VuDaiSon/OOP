package lab4.oop.exercise.composition.myRectangleand.myPoint;

import lab4.oop.exercise.composition.myPoint.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {

        MyRectangle r1 = new MyRectangle(1, 5, 6, 2);
        System.out.println("Rectangle r1: " + r1);
        System.out.println("Width r1: " + r1.getWidth());
        System.out.println("Height r1: " + r1.getHeight());
        System.out.println("Area r1: " + r1.getArea());
        System.out.println("Perimeter r1: " + r1.getPerimeter());

        System.out.println();

        MyPoint p1 = new MyPoint(2, 8);
        MyPoint p2 = new MyPoint(10, 3);
        MyRectangle r2 = new MyRectangle(p1, p2);

        System.out.println("Rectangle r2: " + r2);
        System.out.println("Width r2: " + r2.getWidth());
        System.out.println("Height r2: " + r2.getHeight());
        System.out.println("Area r2: " + r2.getArea());
        System.out.println("Perimeter r2: " + r2.getPerimeter());
    }
}
