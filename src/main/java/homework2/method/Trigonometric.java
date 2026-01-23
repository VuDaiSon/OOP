package homework2.method;

import java.util.Scanner;

/**
 * Write methods to compute sin(x) and cos(x)
 */
public class Trigonometric {
    public static void main(String[] args) {
        testTrigonometric();
    }
    public static double sin(double x, int numTerms){
        double sum = 0.0;
        double term = x;
        for(int i = 1; i <= numTerms; i++){
            sum += term;
            term *= -x * x / ((2 * i) * (2 * i + 1));
        }
        return sum;
    }
    public static double cos(double x, int numTerms) {
        double sum = 0.0;
        double term = 1.0;
        for (int k = 1; k <= numTerms; k++) {
            sum += term;
            term *= -x * x / ((2 * k - 1) * (2 * k));
        }
        return sum;
    }
    public static void testTrigonometric() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x (radians): ");
        double x = in.nextDouble();

        System.out.print("Enter number of terms: ");
        int numTerms = in.nextInt();

        double mySin = sin(x, numTerms);
        double myCos = cos(x, numTerms);

        System.out.println("Using series:");
        System.out.println("sin(" + x + ") = " + mySin);
        System.out.println("cos(" + x + ") = " + myCos);

        System.out.println("\nUsing Math library:");
        System.out.println("Math.sin(" + x + ") = " + Math.sin(x));
        System.out.println("Math.cos(" + x + ") = " + Math.cos(x));
    }


}
