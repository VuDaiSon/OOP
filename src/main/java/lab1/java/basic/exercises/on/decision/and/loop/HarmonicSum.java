package lab1.java.basic.exercises.on.decision.and.loop;

// a program called HarmonicSum to compute the sum of a harmonic series, where n = 50000
// The program shall compute the sum from left-to-right as well as from the right-to-left
// Are the two sums the same?Obtain the absolute difference between these two sums and explain
// the difference. Which sum is more accurate?
public class HarmonicSum {
    public static void main(String[] args) {
        final int MAXDENOMINATOR = 50000;
        double sumR2L = 0.0;
        double sumL2R = 0.0;
        double absDiff;
        for(int denominator = 1; denominator < MAXDENOMINATOR; denominator++){
            sumL2R = sumL2R + 1.0/denominator;
        }
        System.out.println("The sum from left to right is: " + sumL2R);
        for(int denominator = MAXDENOMINATOR; denominator > 1; denominator--){
            sumR2L = sumR2L + 1.0/denominator;
        }
        System.out.println("The sum from right to left is: " + sumR2L);
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }
        System.out.println("The absolute difference is: " + absDiff);

    }
}
