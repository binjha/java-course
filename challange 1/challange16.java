import java.util.Scanner;

public class challange16 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int num1,num2,num3;
        num1=input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();

        if (num1>=num2 && num1>=num3) {
            System.out.println(num1+" is the greatest ");
            
        } else if (num2>=num3 && num2>=num1) {
            System.out.println(num2+"is greatest");
            
        }else {
            System.out.println(num3+"is the greatest");
        }

        
    }
}