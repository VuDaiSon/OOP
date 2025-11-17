package lab1.java.basic.exercises.on.decision.and.loop;
import java.util.Scanner;

/**
Write a program called ComputePI to compute the value of π, using the following series
expansion. Use the maximum denominator (MAX DENOMINATOR) as the terminating
condition. Try MAX DENOMINATOR of 1000, 10000, 100000, 1000000 and compare the PI
obtained. Is this series suitable for computing PI ? Why?
Hints: Add to sum if the denominator % 4 is 1, and subtract from sum if it is 3.
 */
public class ComputePI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Max Denominator: ");
        int MAXDENOMINATOR = sc.nextInt();
        double sum = 0.0;
        for(int denominator = 1; denominator < MAXDENOMINATOR; denominator += 2){
            if(denominator % 4 == 1){
                sum += 1.0/denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1.0/denominator;
            }
            else System.out.println("Impossible");
        }
        double pi = sum*4;
        System.out.println("PI computed with " + MAXDENOMINATOR + " terms = " + pi);

    }
}
