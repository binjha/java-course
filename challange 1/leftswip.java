import java.util.Scanner;

public class left {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("ENter the number for compliment of bit");
    int num1=input.nextInt();

    int result = ~num1;
    System.out.println("The result is "+result);

}
}
