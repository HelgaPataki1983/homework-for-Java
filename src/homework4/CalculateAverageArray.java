package homework4;
/*Write a program to calculate average value of an array elements.
        Example array: {3, 5, 7}
        Expected output:
        The average is: 5.0*/
import java.util.Scanner;

import static homework5.OperationsWithIntArray.averOfArray;
public class CalculateAverageArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the  array: ");
        int[] arrayOf = new int[input.nextInt()];
        float resultt = averOfArray(new int[input.nextInt()]);
        System.out.println("The average is: " + resultt);
        }
}

