package lab4.oop.excersice.classes.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(3.5);
        System.out.println(circle1);
        System.out.println("The circle has radius of: " + circle1.getRadius() + " and area of " + circle1.getArea() + ", circumference: "+ circle1.getCircumference());

        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has radius of: " + circle2.getRadius() + " and area of " + circle2.getArea());
        Circle circle3 = new Circle(3.0, "blue");
        System.out.println("The circle has radius of: " + circle3.getRadius() + " and area of " + circle3.getArea());
    }
}
