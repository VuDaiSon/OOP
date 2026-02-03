package lab4.oop.excersice.classes.myPolynomial;


public class TestMain {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(2.4, 6.8, 9.0);
        MyPolynomial p2 = new MyPolynomial(5.1, 7.8, 10.7);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        System.out.println("p1(2) = " + p1.evaluate(2));
        System.out.println("p2(3) = " + p2.evaluate(3));

        MyPolynomial sum = new MyPolynomial(2.4, 6.8, 9.0);
        System.out.println("p1 + p2 = " + sum.add(p2));

        MyPolynomial product = new MyPolynomial(2.4, 6.8, 9.0);
        System.out.println("p1 * p2 = " + product.multiply(p2));
    }
    }
