import java.util.Scanner;

public class Relationnn{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to driving school");
        System.out.print("Enter your age ");
        int age=input.nextInt();

        if (age>=18) {
            System.out.println("You can drive");
            
        } else {
            System.out.println("Ma chudao");
            
        }

    }
}