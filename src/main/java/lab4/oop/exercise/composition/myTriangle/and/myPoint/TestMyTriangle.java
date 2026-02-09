package lab4.oop.exercise.composition.myTriangle.and.myPoint;


import lab4.oop.exercise.composition.myPoint.MyPoint;

public class TestMyTriangle {
    public static void main(String[] args) {

        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println("t1: " + t1);
        System.out.println("t1 perimeter: " + t1.getPerimeter());
        System.out.println("t1 type: " + t1.getType());

        MyTriangle t2 = new MyTriangle(
                new MyPoint(0, 0),
                new MyPoint(2, 0),
                new MyPoint(1, (int)Math.sqrt(3))
        );
        System.out.println("t2: " + t2);
        System.out.println("t2 perimeter: " + t2.getPerimeter());
        System.out.println("t2 type: " + t2.getType());

        MyTriangle t3 = new MyTriangle(0, 0, 2, 0, 1, 3);
        System.out.println("t3: " + t3);
        System.out.println("t3 perimeter: " + t3.getPerimeter());
        System.out.println("t3 type: " + t3.getType());
    }
}
