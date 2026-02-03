package lab4.oop.excersice.classes.myComplex;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex myComplex1 = new MyComplex(1.1, 2.2);
        System.out.println("Enter complex number 1 (real and imaginary part): " + myComplex1.getReal() + " " + myComplex1.getImag());
        MyComplex myComplex2 = new MyComplex(3.3, 4.4);
        System.out.println("Enter complex number 2 (real and imaginary part): " + myComplex2.getReal() + " " + myComplex2.getImag());
        System.out.println("Number 1 is: " + myComplex1);
        System.out.println(myComplex1 + (myComplex1.isReal() ? " is a pure real number" : " is NOT a pure real number"));
        System.out.println(myComplex1 + (myComplex1.isImaginary() ? " is a pure imaginary number" : " is NOT a pure imaginary number"));
        System.out.println("Number 2 is: " + myComplex2);
        System.out.println(myComplex2 + (myComplex2.isReal() ? " is a pure real number" : " is NOT a pure real number"));
        System.out.println(myComplex2 + (myComplex2.isImaginary() ? " is a pure imaginary number" : " is NOT a pure imaginary number"));
        System.out.println(myComplex1 +( myComplex1.equals(myComplex2) ? " is equal to " + myComplex2 : " is NOT equal to " + myComplex2));
        System.out.println(myComplex1 + " + " + myComplex2 + " = " + myComplex1.addNew(myComplex2) );
    }
}
