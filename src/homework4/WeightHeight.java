package homework4;

import java.util.Scanner;

public class WeightHeight
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height: ");
        int[] weight = new int[scan.nextInt()];
        System.out.println("Enter width: ");
        int[] height = new int[scan.nextInt()];
        for(int i = 1; i <= weight.length; i++)
        {
            for(int j = 1; j <= height.length; j++)
            {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}

