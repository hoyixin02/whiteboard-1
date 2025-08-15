import java.util.Scanner;
import java.util.Arrays;

public class FibonacciSequence {
    
    static long [] number;
    
    public static long fibonacci(int n) {// recursive
        if (n == 0) return 0;  // base case
        if (n == 1) return 1;  // base case
       
        if (number[n] != -1) 
            return number[n];//return stored value
       
        number[n] = fibonacci(n - 1) + fibonacci(n - 2);//calculate then store it into number array
            return number[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of Fibonacci sequence elements: ");
        int n = sc.nextInt();

        number = new long[n];//initialize array
        Arrays.fill(number, -1);

        System.out.println("\nFibonacci sequence:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i));
            if (i != n - 1) System.out.print(", ");
        }
    }

}

