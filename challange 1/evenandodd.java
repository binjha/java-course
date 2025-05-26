import java.util.Scanner;

public class evenandodd {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Entert the number");
        int num1=input.nextInt();

        if ((num1 & 1)==1) {
            System.out.println("The number is odd ");
            
        }else{
            System.out.println("The number is even ");
        }

        


    
    }
    
}
