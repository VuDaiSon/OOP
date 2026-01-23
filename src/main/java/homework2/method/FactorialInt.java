package homework2.method;

/**
 * Write a method called factorialInt() to list all the factorials that can be expressed as an int
 * (i.e., 32-bit signed integer in the range of [−2147483648, 2147483647]).
 */
public class FactorialInt {
    public static void main(String[] args) {
        factorialInt();
    }
    public static void factorialInt(){
        int n = 1;
        int factorial = 1;
        while(true){
            System.out.println("The factorial of " + n + " is: " + factorial);
            if(Integer.MAX_VALUE/factorial < (n + 1)){
                System.out.print("factorial of " + (n+1) + " is out of range");
                break;
            }
            n += 1;
            factorial *= n;
        }
    }
}
