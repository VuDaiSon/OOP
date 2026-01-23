package homework2.method;

/**
 * Write a method called fibonacciInt() to list all the Fibonacci numbers, which can be expressed
 * as an int (i.e., 32-bit signed integer in the range of [−2147483648, 2147483647]).
 */
public class FibonacciInt {
    public static void main(String[] args) {
        fibonacciInt();
    }
    public static void fibonacciInt(){
        int n = 0;
        int f0 = 1; // F(n-2)
        int f1 = 1; // F(n-1)
        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        while(true){
            if(Integer.MAX_VALUE - f1 < f0){
                System.out.println("F(" + (n + 2) + ") is out of the range of int");
                break;
            }
            int f2 = f1 + f0;
            n++;
            System.out.println("F(" + (n + 1) + ") = " + f2);
            f0=f1;
            f1=f2;
        }
    }
}
