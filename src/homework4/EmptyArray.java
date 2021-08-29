package homework4;
/*Ask user to input qty of elements in the array.
        Create an empty array of the given qty of elements.
        Write a program that fills in your empty array with numbers from 1 (at 0 index of your array) to the last array element.
        Print the resulting array into console.*/

import java.util.Scanner;

public class EmptyArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any qty of elements: ");
        int[] array = new int[input.nextInt()];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = i + 1;
            System.out.printf(" %d", array[i]);
        }
    }
}
