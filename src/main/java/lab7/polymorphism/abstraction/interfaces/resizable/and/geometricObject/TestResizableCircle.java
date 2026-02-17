package lab7.polymorphism.abstraction.interfaces.resizable.and.geometricObject;


public class TestResizableCircle {

    public static void main(String[] args) {
ResizableCircle resizableCircle = new ResizableCircle(20);
        System.out.println("Initial ResizableCircle: " + resizableCircle
        );

        System.out.println("Initial area: " + resizableCircle.getArea()
        );

        System.out.println("Initial perimeter: " + resizableCircle.getPerimeter()
        );
        resizableCircle.resize(50);
        System.out.println("After resizing (e.g., 50%): " + resizableCircle
        );

        System.out.println("Area after resizing: " + resizableCircle.getArea()
        );

        System.out.println("Perimeter after resizing: " + resizableCircle.getPerimeter()
        );
        Circle resizableCircle2 = new ResizableCircle(30);
        System.out.println("Calling getArea via Circle reference: " + resizableCircle2.getArea()
        );

    }
}
