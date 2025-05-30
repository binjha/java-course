import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check palinderome ");
        int num=input.nextInt();
        if (isPalindrome(num)) {
            System.out.println("Number is palindrome "+num);
            
        }
        else{
            System.out.println("Number is not palindrome ");
        }


    }

    public static boolean isPalindrome(int num){
        int orginal=num;
        int reverse=0;
        while (num!=0) {
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;

            
        }
        return reverse == orginal;
    }
}
