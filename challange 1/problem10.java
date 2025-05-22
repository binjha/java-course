import java.util.Scanner;

public class problem10 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("the breadth is ");
        double breadth=input.nextDouble();
        System.out.print("the height is ");
        double height=input.nextDouble();
        double area=0.5*breadth*height;
        System.out.println("The area of rectangle is "+(area));



    }
}