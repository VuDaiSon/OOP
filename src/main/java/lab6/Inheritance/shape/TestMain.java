package lab6.Inheritance.shape;

public class TestMain {
    public static void main(String[] args) {

        System.out.println("===== TEST SHAPE =====");
        Shape shape = new Shape("gray", true);
        System.out.println("Shape toString: " + shape);
        System.out.println("Color is: " + shape.getColor());
        System.out.println("Filled is: " + shape.isFilled());

        System.out.println("\n===== TEST CIRCLE =====");
        Circle circle = new Circle("red", false,24);
        System.out.println("Circle toString: " + circle.toString());
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        System.out.println("\n===== TEST RECTANGLE =====");
Rectangle rectangle = new Rectangle("Blue", true, 25, 50);
        System.out.println("Rectangle toString: " + rectangle.toString());
        System.out.println("Width is: " + rectangle.getWidth());
        System.out.println("Length is: " + rectangle.getLength());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        System.out.println("\n===== TEST SQUARE =====");
        Square square = new Square("Purple", false, 30);
        System.out.println("Square toString: " + square.toString());
        System.out.println("Side is: " + square.getSide());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
        square.setSide(25);
        System.out.println("Width after setSide: " + square);
        square.setLength(30);
        System.out.println("Length after setSide: " + square);
    }
}
