package lab3.java.basic.recursion;

import java.util.Scanner;

public class RunningNumberLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.println("len(" + n + ") = " + len(n));
    }
    public static int len(int n) {
        if(n==1){
            return 1;
        }else{
            return len(n-1) + numOfDigits(n);
        }
    }
    public static int numOfDigits(int n){
        int count = 0;
        do{
            count++;
            n/=10;
        }while(n!=0);
        return count;
    }
}
