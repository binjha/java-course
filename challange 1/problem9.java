import java.util.Scanner;

public class problem9 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("the length is ");
        int length=input.nextInt();
        System.out.print("the breadth is ");
        int breadth=input.nextInt();
        int perimitere=length+breadth;
        System.out.println("The perimetre of rectangle is "+(2*perimitere));



    }
}