import java.util.Scanner;

public class challange17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year");
        int year= input.nextInt();

        if ((year % 4==0 && year %100!=0 ) || (year % 400==0) ){
            System.out.println("The year "+year+" is leap year");
            
        } else {
            System.out.println("the year "+year+" is not a leap year");
        }

        
    }
}
