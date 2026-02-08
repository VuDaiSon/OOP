package lab4.oop.exercise.composition.myPoint;

public class TestMain {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3,4);
        System.out.println(point1.distance());
        System.out.println(point1.distance(5,6));

        MyPoint point2 = new MyPoint(5,6);
        System.out.println(point1.distance(point2));

        MyPoint point3 = new MyPoint();
        System.out.println(point3);
        point3.setX(8);
        point3.setY(6);
        System.out.println("x is: " + point3.getX());
        System.out.println("y is: " + point3.getY());
        point3.setXY(3,0);
        System.out.println(point3.getXY()[0]);
        System.out.println(point3.getXY()[1]);
        System.out.println(point3);

        MyPoint point4 = new MyPoint(0,4);
        System.out.println(point4);
        System.out.println(point3.distance(point4));
        System.out.println(point4.distance(point3));
        System.out.println(point3.distance(5,6));
        System.out.println(point3.distance());

        MyPoint[] points = new MyPoint[10];
        for(int i = 0; i<points.length; i++){
            points[i] = new MyPoint((i+1),(i+1));
            System.out.println(points[i]);
        }
    }
}
