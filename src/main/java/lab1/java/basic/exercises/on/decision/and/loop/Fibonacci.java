package lab1.java.basic.exercises.on.decision.and.loop;
//Write a program called Fibonacci to print the first 20 Fibonacci numbers F(n)
// where F(n) = F(n–1) + F(n–2) and F(1) = F(2) = 1.
public class Fibonacci {
    public static void main(String[] args) {
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum  = fnMinus1 + fnMinus2;
        double average;
        System.out.print("The first " + nMax + " Fibonacci numbers are: ");
        for(int n  = 3; n <= nMax; n ++){
            System.out.print((fn = fnMinus1 + fnMinus2) + " ");
            sum += fn;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        average = (double) sum / nMax;
        System.out.println("\nThe average is " + average);
    }
}
