package lab7.polymorphism.abstraction.geometricObject.interfaceAnd.its.implementation.classes.circle.and.rectangle;

public class TestMain {

    public static void main(String[] args) {

        // ===== TEST OBJECT TRỰC TIẾP =====
        Circle circle1 = new Circle(2.0);
        System.out.println("Diện tích hình tròn: " + circle1.getArea()
        );

        System.out.println("Chu vi hình tròn: " + circle1.getPerimeter()
        );
        Rectangle rectangle1 = new Rectangle(20,30);
        System.out.println("Diện tích hình chữ nhật: " + rectangle1.getArea()
        );

        System.out.println("Chu vi hình chữ nhật: " + rectangle1.getPerimeter()
        );


        // ===== TEST QUA REFERENCE CHA (ĐA HÌNH) =====
        GeometricObject rectangle2 = new Rectangle(20,20);
        System.out.println("Diện tích (gọi qua GeometricObject): " + rectangle2.getArea()
        );

        System.out.println("Chu vi (gọi qua GeometricObject): " + rectangle2.getPerimeter()
        );


        // ===== TEST MẢNG ĐA HÌNH =====
        GeometricObject[] geometricObjects = new GeometricObject[2];
        geometricObjects[0] = new Circle(22);
        geometricObjects[1] = new Rectangle(98,20);
        System.out.println("Diện tích phần tử thứ 1 trong mảng: " + geometricObjects[0].getArea()
        );

        System.out.println("Diện tích phần tử thứ 2 trong mảng: " + geometricObjects[1].getArea()
        );

        System.out.println("Chu vi phần tử thứ 1 trong mảng: " + geometricObjects[0].getPerimeter()
        );

        System.out.println("Chu vi phần tử thứ 2 trong mảng: " + geometricObjects[1].getPerimeter()
        );


        // ===== TEST toString (nếu có override) =====

        System.out.println("Thông tin đối tượng: " + circle1
        );

    }
}
