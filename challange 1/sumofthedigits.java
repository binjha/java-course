// import java.util.Scanner;

// public class sumofthedigits {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Program for the sum of the digits ");
//         System.out.print("Enter the num: ");
//         int num = input.nextInt();

//         int sum = SumofNumber(num);
//         System.out.println("The sum of the digits of no " + num + " is " + sum);

//     }

//     public static int SumofNumber(int num) {
//         int sum = 0;
//         while (num > 0) {
//             sum += num % 10;
//             num /= 10;

//         }
//         return sum;
//     }

// }

import java.util.Scanner;

public class sumofthedigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = input.nextInt();
        int result = sumdigit(num);
        System.out.println("The sum ofdigits =" + result);
    }

    public static int sumdigit(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;

        }
        return sum;
    }

}