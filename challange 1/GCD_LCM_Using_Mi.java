import java.util.Scanner;

public class GCD_LCM_Using_Mi {

    // Function to find GCD by checking from min down to 1
    public static int findGCD(int a, int b) {
        int min = (a < b) ? a : b;
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1; // Default GCD if no other common factor
    }

    // Function to find LCM by checking from max upward
    public static int findLCM(int a, int b) {
        int max = (a > b) ? a : b;
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Compute GCD and LCM
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        // Display results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
