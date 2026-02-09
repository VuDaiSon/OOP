package lab4.oop.exercise.classes.myComplex;

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

        myComplex1.setReal(7.8);
        myComplex1.setImag(1.6);
        System.out.println("c1 after setReal: " + myComplex1.getReal());
        System.out.println("c1 after setImag: " + myComplex1.getImag());
        myComplex1.setValue(9.0,1.98);
        System.out.println("c1 after setValue: " + myComplex1);

        System.out.println("Magnitude of c1: " + myComplex1.magnitude());
        System.out.println("Argument of c1: " + myComplex1.argument());

        System.out.println("c1 before add c2: " + myComplex1);
        myComplex1.add(myComplex2);
        System.out.println("c1 after add c2: " + myComplex1);

        System.out.println("c1 addNew c2 result: " + myComplex1.addNew(myComplex2));
        System.out.println("c1 after addNew (should unchanged): " + myComplex1 );

        System.out.println("c1 before subtract c2: " + myComplex1);
        System.out.println("c1 after subtract c2: " + myComplex1.subtract(myComplex2));

        System.out.println("c1 subtractNew c2 result: " + myComplex1.subtractNew(myComplex2));
        System.out.println("c1 after subtractNew (should unchanged): " + myComplex1);

        System.out.println("c1 before multiply c2: " + myComplex1);
        System.out.println("c1 after multiply c2: " + myComplex1.multiply(myComplex2));

        System.out.println("c1 before divide c2: " + myComplex1);
        System.out.println("c1 after divide c2: " + myComplex1.divide(myComplex2));

        System.out.println("c1 before conjugate: " + myComplex1);
        System.out.println("c1 after conjugate: " + myComplex1.conjugate());


    }
}
