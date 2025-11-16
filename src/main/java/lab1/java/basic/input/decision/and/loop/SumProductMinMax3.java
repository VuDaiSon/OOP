package lab1.java.basic.input.decision.and.loop;

import java.util.Scanner;
/**
 Write a program called SumProductMinMax3 that prompts user for three integers.
 The program shall read the inputs as int;
 compute the sum, product, minimum and maximum of the three integers; and print the results.
 */
public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2st integer: ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3st integer: ");
        int n3 = sc.nextInt();
        int sum;
        int min;
        int max;
        System.out.println("The sum is: " + (sum = n1 + n2 + n3));
        System.out.println("The product is: " + n1 * n2 * n3);
        max = n1;
        if(n2 > max){
            max = n2;
        }
        if(n3 > max){
            max = n3;
        }
        System.out.println("The max is: " + max);
        min = n1;
        if(n2 < min){
            min = n2;
        }
        if(n3 < min){
            min = n3;
        }
        System.out.println("The min is: " + min);
    }
}
