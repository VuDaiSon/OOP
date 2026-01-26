package lab3.java.basic.algorithms.number.theory;

import java.util.Scanner;

/**
 * Using the methods, write a program called PerfectNumberList that prompts user for an
 * upper bound (a positive integer), and lists all the perfect numbers less than or equal to this
 * upper bound. It shall also list all the numbers that are neither deficient nor perfect.
 */
public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int n = in.nextInt();
        System.out.print("These numbers are perfect: ");
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(isPerfect(i)){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count + " perfect number found (" + Math.round(((double) count /n) * 10000.0)  / 100.0 + "%)");
        System.out.print("These number are neither deficient not perfect: ");
        int total=0;
        for(int i = 1; i<= n; i++){
            if(!isPerfect(i) && !isDeficient(i)
            ){
            System.out.print(i + " ");
            total++;
            }
        }
        System.out.println();
        System.out.println(total + " abundant number found (" + Math.round(((double) total /n) * 10000.0)  / 100.0 + "%)");
    }
    public static boolean isPerfect(int aPosInt){
        int sum = 0;
        for(int i = 1; i<aPosInt; i++){
            if(aPosInt % i == 0){
                sum+=i;
        }
    }
        return sum == aPosInt;
    }
    public static boolean isDeficient(int aPosInt){
        int sum = 0;
        for(int i = 1; i<aPosInt; i++){
            if(aPosInt % i == 0){
                sum+=i;
            }
        }
        return sum < aPosInt;
}}
