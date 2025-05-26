import java.util.Scanner;

public class rightswift{
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("ENter the number for rightswip of bit");
    int num1=input.nextInt();

    int result = num1>>1;
    System.out.println("The result is "+result);

}
}
