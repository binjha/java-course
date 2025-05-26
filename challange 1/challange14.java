import java.util.Scanner;

public class challange14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the nubmber");
        int number=input.nextInt();

        if (number>0) {
            System.out.println("The number is positive");
            
        }else if (number<0) {
            System.out.println("The number is negative");
            
        }else System.out.println("number is equal to zero");
    }
}
