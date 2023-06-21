package module31;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacciSum(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacciSum(n - 1) + fibonacci(n);
    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        int result = fibonacciSum(n);
        System.out.println("The sum of the module31.Fibonacci sequence up to position " + n + " is: " + result);
    }
}