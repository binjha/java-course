import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number ");
        int first=input.nextInt();
        System.out.println("Enter the second number ");
        int second=input.nextInt();
        int resultgcd=findgcd(first,second);
        int resultlcm =findlcm(first,second);
        System.out.println("gcd is "+findgcd(first, second));
        System.out.println("gcd is "+findlcm(first,second));



    }
    public static int findgcd(int first,int second){
        while (second!=0){
            int temp=second;
            second=first%second;
            first=temp;

        }
        return first;

            
        
    }
    public static int findlcm(int first,int second){
        return (first*second)/findgcd(first,second);
    }
    
}
