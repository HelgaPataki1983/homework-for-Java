package homework4;
/*Create an array of integers.
        Write a Java program to sum values of the array.*/
public class SumOfArray
{
    public static void main(String[] args)
    {
        int[] array = {2,3,4};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        System.out.print(sum);
    }
}
