package lab3.java.basic.algorithms.number.theory;

import java.util.Scanner;

import static lab3.java.basic.algorithms.number.theory.PrimeNumber.isPrime;

/**
 * Write a boolean method called isProductOfPrimeFactors(int aPosInt) that takes a positive
 * integer, and return true if the product of all its prime factors (excluding 1 and the number
 * itself) is equal to its value. For example, the method returns true for 30 (30 = 2 × 3 × 5)
 * and false for 20 (20 ̸= 2 × 5). You may need to use the isPrime() method in the previous exercise.
 * Write a program called PerfectPrimeFactorList that prompts user for an upper bound. The
 * program shall display all the numbers (less than or equal to the upper bound) that meets
 * the above criteria.
 */
public class PrimeFactor {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            perfectPrimeFactorList(in);
    }
    public static boolean isProductOfPrimeFactors(int aPosInt){
        int product = 1;
        for(int i = 2; i<=aPosInt/2; i++){
            if(aPosInt % i == 0&& isPrime(i)){
                    product*=i;
            }
        }
        return product == aPosInt;
    }
    public static void perfectPrimeFactorList(Scanner in){
        System.out.print("Enter the upper bound: ");
        int n = in.nextInt();
        int count = 0;
        System.out.print("These numbers are equal to the product of prime factors: ");
        for(int i = 2; i < n; i++){
            if(isProductOfPrimeFactors(i)){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.print(count + " number found (" + Math.round(((double) count/n) * 100000.0)/1000.0 + "%)");
    }
}
