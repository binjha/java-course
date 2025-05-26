import java.util.Scanner;

public class bitwiseand {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1=input.nextInt();
        System.out.println("Enter the second number ");
        int num2=input.nextInt();

        int result =num1 & num2;
        System.out.println("The bitwise and of num1 and num2 is "+result);

//bitwise add the binary of two numbers and if 11 is there give one and othewise 0 learn on chatgpt
    }
}