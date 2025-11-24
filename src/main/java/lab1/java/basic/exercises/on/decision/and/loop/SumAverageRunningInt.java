package lab1.java.basic.exercises.on.decision.and.loop;
/**
 Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, . . . , to 100.
 Store 1 and 100 in variables lowerbound and upperbound, so that we can change their values easily
 Also compute and display the average.
 */
public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        for(int i = LOWERBOUND; i<= UPPERBOUND; i++){
            sum += i;
        }
        average = (double) sum/ (UPPERBOUND - LOWERBOUND + 1);
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average);
    }
}
