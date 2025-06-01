import java.util.Scanner;

public class sumandaverage {

    public static void main(String[] args) {
        System.out.println("Welcome to array sum and average ");
        int numarray[] = ArrayUtility.inputArray();
        long sum = sum(numarray);
        double average = average(numarray);
        System.out.println("Sum of the array is " + sum + " and the average is " + average);

    }

    public static long sum(int[] numarray) {
        long sum = 0;
        int i = 0;
        while (i < numarray.length) {
            sum += numarray[i];
            i++;

        }
        return sum;

    }

    public static double average(int[] numarray) {
            double sum = sum(numarray);

        return (sum / numarray.length);

    }
}