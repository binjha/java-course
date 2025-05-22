import java.util.Scanner;
public class problem11 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("the principle amount ");
        int principle=input.nextInt();
        System.out.print("the rate at interesr  is ");
        float rate =input.nextFloat();
        System.out.print("the time of loan");
        float time=input.nextFloat();

        double simpleintrest=(principle*time*rate)/1000;
        System.out.println("The simple intrest is "+(simpleintrest));
        



    }`
}