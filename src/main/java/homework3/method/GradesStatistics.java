package homework3.method;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {

    // Declare an int[] to store grades (allocated later)
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();

        System.out.print("The grades are: ");
        print(grades);

        System.out.printf("The average is: %.2f%n", average(grades));
        System.out.printf("The median is: %.2f%n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f%n", standardDeviation(grades));
    }

    // Prompt user for number of students, allocate grades array,
    // then read and validate each grade (0–100)
    public static void readGrades() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = in.nextInt();
        grades = new int[n];
        for(int i = 0; i<grades.length; i++) {
            System.out.print("Enter the grade for student: " + (i+1));
            grades[i] = in.nextInt();
        }
    }

    // Print array in the form [x1, x2, x3, ..., xn]
    public static void print(int[] array) {
        System.out.print("[" + array[0]);
        for(int i = 1; i<array.length; i++){
            System.out.print(", " + array[i]);
        }
        System.out.print("]");
    }

    // Return the average value of the given int[]
    public static double average(int[] array) {
        int sum = 0;
        for(int i : array){
            sum += array[i];
        }
        return (double) sum /(array.length);
    }

    // Return the median value of the given int[]
    // If length is odd → middle element
    // If length is even → average of two middle elements
    // Use Arrays.sort(array)
    public static double median(int[] array) {
        int[] sortedArray = array.clone();

        Arrays.sort(sortedArray);
        int n = array.length;
        if(n%2==0){
            return (sortedArray[(n-1)/2] + sortedArray[n/2]) / 2.0;
        }
        else{
        return sortedArray[n/2];}
    }

    // Return the maximum value of the given int[]
    public static int max(int[] array) {
        int max = array[0];
        for(int i : array){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    // Return the minimum value of the given int[]
    public static int min(int[] array) {
        int min = array[0];
        for(int i : array){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    // Return the standard deviation of the given int[]
    // Formula: sqrt( (1/n) * Σ(xi^2) − mean^2 )
    public static double standardDeviation(int[] array) {
        double standardDeviation = 0.0;
        double sum = 0.0;
        for(int num : array){
            sum += num;
        }
        double mean = sum/array.length;
        for(double num : array){
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation / array.length);    }
}
