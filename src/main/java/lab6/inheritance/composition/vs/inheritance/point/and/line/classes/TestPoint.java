package lab6.inheritance.composition.vs.inheritance.point.and.line.classes;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        System.out.println(p1);
        p1.setXY(100,10);
        System.out.println("p1 after set XY: " + p1);
    }
}
