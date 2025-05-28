// import java.util.Scanner;

// public class FactorialCalculator {

//     // Function to calculate factorial using a loop
//     public static long factorial(int n) {
//         long result = 1;
//         for (int i = 1; i <= n; i++) {
//             result *= i; // Multiply result by current number
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // User input
//         System.out.print("Enter a non-negative integer: ");
//         int number = scanner.nextInt();

//         // Input validation
//         if (number < 0) {
//             System.out.println("Factorial is not defined for negative numbers.");
//         } else {
//             // Function call and output
//             long fact = factorial(number);
//             System.out.println("Factorial of " + number + " is: " + fact);
//         }
//     }
// }

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial is: " + fact);
    }

    public static long factorial(int num) {
        if (num < 2) {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}