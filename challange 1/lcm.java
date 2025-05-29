import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
       System.out.print("Enter the first number: ");
       Scanner input=new Scanner(System.in);
       int first =input.nextInt();
       System.out.print("Enter the second number: ");
       int second =input.nextInt();
        int result=lcmm(first,second);
        System.out.println("the lcm of "+first+" and "+second+" is "+result);
        int resultt=findlcm(first, second);
        System.out.println("the lcm of "+first+" and "+second+" is "+resultt);





    }

    public static int findlcm(int first,int second){
        int max=(first>second)?first:second;
        while(true){
            if(max % first ==0 && max % second ==0){
                System.out.println("Hello pooja");
                return max;


            }
            max++;
        }
    }

    public static int lcmm(int first,int second){
        int i=1;
        while (true) {
            int factor=first*i;
            if (factor%second==0) {
                return factor;
            }
            i++;
        }
    }
}
