import java.util.Scanner;

public class leftswipp{
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("ENter the number for leftswip of bit");
    int num1=input.nextInt();

    int result = num1<<1;
    System.out.println("The result is "+result);

}
}
