import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no for table you want ");
        int num=input.nextInt();
        
        table(num);
        
    }
    public static void table(int num){
        int i =1;

        while (i<=10) {
            System.out.println( num+" * "+i+" = "+(num*i));
            i++;
            
            
            
        }
    }
}
