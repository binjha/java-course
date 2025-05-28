// import java.util.Scanner;

// public class oddsum {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the range ");
//         int num = input.nextInt();
//         int sum = oddsum(num);
//         System.out.println("the sum of odd numbers is " + sum);

//     }

//     public static int oddsum(int num) {
//         int i = 1;
//         int sum = 0;
//         while (num >= i) {
//             sum += i;
//             i += 2;

//         }
//         return sum;

//     }

// }

import java.util.Scanner;

public class oddsum {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sum of odd numbers ");
        System.out.println("Entert the number till you want sum of odd numbers ");
        int num=input.nextInt();
        int result =oddsumm(num);
        System.out.println("the sum of odd numbers is  "+result);


    }
    public static int oddsumm(int num){
        int sum=0;
        for (int i = 0; i <= num; i++) {
            if (i%2!=0) {
                sum+=i;

                
            }
            
        }
        return sum;

    }
}