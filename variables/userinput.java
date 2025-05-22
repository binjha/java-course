import java.util.Scanner;

public class userinput{

    public static void main(String[] args) {
        System.out.println("hello Binjha");
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter your name ");
        String name =input.nextLine();
        System.out.println("good morning "+name);  

        int num=input.nextInt();
        System.out.println("Your age is "+num);


        
    }
}