 import java.util.Scanner;
public class problem13{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the temp in fahrentite ");
        float fahrentint=input.nextFloat();
        double celcious= (fahrentint-32)*(5.0/9.0);
        System.out.println("the temp in celcious is "+celcious);

        



    }
} 
