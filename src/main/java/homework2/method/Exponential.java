package homework2.method;

import java.util.Scanner;

/**
 * Write a method to compute the sum of the series.
 */
public class Exponential {
    public static void main(String[] args) {
testSpecialSeries();
    }
    public static double specialSeries(double x, int numTerms){
        double sum = 0.0;
        double term = x;
        for(int i = 0; i<numTerms; i++){
            sum += term;
            term = term*(((2.0*i+1)/(2*i+2)) * ((x*x)/(2*i+3)));
        }
        return sum;
    }
    public static void testSpecialSeries() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x (-1 <= x <= 1): ");
        double x = in.nextDouble();
        System.out.print("Enter number of terms: ");
        int numTerms = in.nextInt();
        double result = specialSeries(x, numTerms);
        System.out.println("The sum of the series is: " + result);
    }
}
