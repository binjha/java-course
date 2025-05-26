import java.util.Scanner;

public class challange15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=input.nextInt();

        if (number%2 ==0) {
            System.out.println("number is even");
            
        }else
        {
            System.out.println("Number is odd   ");
        }
    }
    
}
