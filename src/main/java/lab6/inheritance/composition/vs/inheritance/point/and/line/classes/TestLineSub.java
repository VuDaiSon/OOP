package lab6.inheritance.composition.vs.inheritance.point.and.line.classes;

public class TestLineSub {
    public static void main(String[] args) {

        System.out.println("=== Test Constructor with 4 ints ===");
        LineSub line1 = new LineSub(60, 20, 40, 10);
        System.out.println("In ra line1: " + line1);
        System.out.println("BeginX = " + line1.getBeginX());
        System.out.println("BeginY = " + line1.getBeginY());
        System.out.println("EndX = " + line1.getEndX());
        System.out.println("EndY = " + line1.getEndY());

        System.out.println("\n=== Test Constructor with 2 Points ===");
        LineSub line2 = new LineSub(new Point(20, 1000), new Point(6000, 20));
        System.out.println("In ra line2: " + line2);
        System.out.println("Begin = " + line2.getBegin());
        System.out.println("End = " + line2.getEnd());

        System.out.println("\n=== Test getBegin() ===");
        System.out.println("Begin point = " + line1.getBegin());

        System.out.println("\n=== Test setBegin(Point) ===");
        line1.setBegin(new Point(100, 200));
        System.out.println("Sau khi setBegin, line = " + line1);

        System.out.println("\n=== Test getEnd() ===");
        System.out.println("End point = " + line1.getEnd());

        System.out.println("\n=== Test setEnd(Point) ===");
        line1.setEnd(new Point(7, 8));
        System.out.println("Sau khi setEnd, line = " + line1);

        System.out.println("\n=== Test setBeginX() ===");
        line1.setBeginX(10);
        System.out.println("Sau khi setBeginX, BeginX = " + line1.getBeginX());

        System.out.println("\n=== Test setBeginY() ===");
        line1.setBeginY(90);
        System.out.println("Sau khi setBeginY, BeginY = " + line1.getBeginY());

        System.out.println("\n=== Test setBeginXY() ===");
        line1.setBeginXY(89, 92);
        System.out.println("Sau khi setBeginXY, Begin = " + line1.getBegin());

        System.out.println("\n=== Test setEndX() ===");
        line1.setEndX(10);
        System.out.println("Sau khi setEndX, EndX = " + line1.getEndX());

        System.out.println("\n=== Test setEndY() ===");
        line1.setEndY(98);
        System.out.println("Sau khi setEndY, EndY = " + line1.getEndY());

        System.out.println("\n=== Test setEndXY() ===");
        line1.setEndXY(20, 19);
        System.out.println("Sau khi setEndXY, End = " + line1.getEnd());

        System.out.println("\n=== Test getLength() ===");
        System.out.println("Length = " + line1.getLength());

        System.out.println("\n=== Test getGradient() ===");
        System.out.println("Gradient = " + line1.getGradient());

        System.out.println("\n=== Test Vertical Line ===");
        LineSub vertical = new LineSub(10, 5, 10, 100);
        System.out.println("Vertical line gradient = " + vertical.getGradient());

        System.out.println("\n=== Full toString() test ===");
        System.out.println("Final line = " + line1);

    }
}
