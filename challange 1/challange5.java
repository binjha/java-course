import java.util.Scanner;

public class challange5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.err.print("Enter the first number: ");
        

        int num1=input.nextInt();
        System.err.print("Enter the second number: ");

        int num2=input.nextInt();
        int num3=num1+num2;


        System.out.println("The sum of num1 and num2 is " +num3);
    }
    
}
