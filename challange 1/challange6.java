import java.util.Scanner;

public class challange6 {
    public static void main(String[] args) {
        System.out.println("program to swap two numbers");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=input.nextInt();
        System.out.print("Enter the second number: ");
        int num2=input.nextInt();
        int num3=num1;
        num1=num2;
        num2=num3;
        System.out.println("Swapping done...");
        System.out.println("The value of num1 is "+num1);
        System.out.println("The value of num1 is "+num2);



        
    }
}
