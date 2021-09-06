package homework4;
/*Create an array of integers.
        Write a Java program to sum values of the array.*/
import static homework5.OperationsWithIntArray.sumOfArray;
public class SumOfArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int sumArray = sumOfArray(array);//что не так?
        System.out.println(sumArray);
    }
}
        /*int[] array = {2,3,4};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        System.out.print(sum);
    }
}*/
