import java.util.Scanner;

public class arrayoccurence {
    public static void main(String[] args) {
        System.out.println("Welcome to array occurence ");
        Scanner input = new Scanner(System.in);
        int[] numArr=ArrayUtility.inputArray();
        System.out.println("Now enter the number you want to find ");
        int num=input.nextInt();
        int occurence=numberofoccurnece(numArr, num);
        System.out.println("Element"+num+ " found on "+occurence+" times in the array ");


    }

    public static int numberofoccurnece(int[] numArr,int num){
        int occ=0;
        int i=0;
        while (i<numArr.length) {
            if (numArr[i]==num) {
                occ++;
                
            }
            i++;

            
        }
        return occ;

    }
    
}
