package lab4.oop.exercise.composition.myCircle.and.myPoint;

import lab4.oop.exercise.composition.myPoint.MyPoint;

public class TestMain {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println("c1 (default): " + c1);
        MyCircle c2 = new MyCircle(5, 6, 2);
        System.out.println("c2 (x,y,r): " + c2);
        MyPoint center = new MyPoint(5, 6);
        MyCircle c3 = new MyCircle(center, 2);
        System.out.println("c3 (MyPoint,r): " + c3);
        System.out.println("radius c2: " + c2.getRadius());
        c2.setRadius(5);
        System.out.println("radius c2 after set: " + c2.getRadius());
        System.out.println("center c3: " + c3.getCenter());
        MyPoint newCenter = new MyPoint(6, 5);
        c3.setCenter(newCenter);
        System.out.println("center c3 after set: " + c3.getCenter());
        System.out.println("centerX c1: " + c1.getCenterX());
        System.out.println("centerY c1: " + c1.getCenterY());
        c1.setCenterX(9);
        c1.setCenterY(8);
        System.out.println("c1 after setCenterX/Y: " + c1.getCenterX() + "/" + c1.getCenterY());
        System.out.println("centerXY c2: " + c2.getCenterXY()[0] + " " + c2.getCenterXY()[1]);
        c2.setCenterXY(8, 2);
        System.out.println("c2 after setCenterXY: " + c2.getCenterXY()[0] + " " + c2.getCenterXY()[1]);
        System.out.println("area c2: " + c2.getArea());
        System.out.println("circumference c2: " + c2.getCircumference());
        System.out.println("distance c1 -> c2: " + c1.distance(c2));
        System.out.println("distance c2 -> c3: " + c2.distance(c3));


    }
}
