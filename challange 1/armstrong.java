import java.util.Scanner;

class ArmstrongNumber {

    // Function to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int original = number;
        int result = 0;
        int n = String.valueOf(number).length(); // number of digits

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }

        return result == original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int num = scanner.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}




