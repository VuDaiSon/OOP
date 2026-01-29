package homework3.method;

import java.util.Scanner;

/**
 * Write a program called GradesHistogram, which reads in n grades (as in the previous exercise),
 * and displays the horizontal and vertical histograms.
 */
public class GradesHistogram {
    public static void main(String[] args) {
        readGrades();
        computeHistogram();
        printHorizontalHistogram();
        printVerticalHistogram();

    }
    public static int[] grades;
    public static int[] bins = new int[10];
    public static void readGrades(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        grades = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter grade " + (i+1) + ": ");
            int grade = in.nextInt();
            if(grade < 0 || grade > 100){
                System.out.print("Invalid grade");
                i--;
            }
            else {
                grades[i] = grade;
            }
        }
    }
    public static void computeHistogram(){
        for(int grade:grades){
            int bin;
            if(grade == 100){
                bin = 9;
            }else {
                bin = grade/10;
            }
            bins[bin]++;
        }
    }
    public static void printHorizontalHistogram(){
        for(int i = 0; i < bins.length; i++){
            if(i==9){
                System.out.print("90-100: ");
            }
            else {
                System.out.print((i*10)+"-"+(i*10+9) + " :");
            }
            for(int j = 0; j< bins[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printVerticalHistogram(){
        int max = bins[0];
        for(int b: bins){
            if(b>max){
                max = b;
            }
        }
        for(int level = max; level >=1; level--){
            for (int bin : bins) {
                if (bin >= level) {
                    System.out.print("  *   ");
                } else {
                    System.out.print("      ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < bins.length; i++) {
            System.out.print("------");
        }
        System.out.println();

        for (int i = 0; i < bins.length; i++) {
            if (i == 9) {
                System.out.printf("%-6s", "90-100");
            } else {
                System.out.printf("%-6s", i*10 + "-" + (i*10+9));
            }
        }
        System.out.println();
    }
}
