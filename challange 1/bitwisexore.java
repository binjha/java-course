import java.util.Scanner;

public class bitwisexore{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1=input.nextInt();
        System.out.println("Enter the second number ");
        int num2=input.nextInt();

        int result =num1 ^ num2;
        System.out.println("The bitwise xor of num1 and num2 is "+result);

        //if things are same then on adding it gives zero otherwise give 



    }
}