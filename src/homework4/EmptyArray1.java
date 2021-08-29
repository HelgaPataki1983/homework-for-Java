package homework4;
//The same as in task 9, create an empty array but fill it in by randomly generated numbers.

import java.util.Scanner;

public class EmptyArray1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any qty of elements: ");
        int[] array = new int[input.nextInt()];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 100);
            System.out.printf(" %d", array[i]);
        }
    }
}
