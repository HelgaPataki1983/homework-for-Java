package homework5;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;
import static java.lang.Math.scalb;

public class OperationsWithIntArray {
    public static void main(String[] args) {


        int number = 3;
        int degree = 2;
        int result = numberRaisedPowerAnother(number, degree);
        System.out.printf("Number %d raised to power %d = %d \n", number, degree, result);

        String reverse = digitsReversed(12345);
        System.out.printf("%s ", reverse);

        int[] array = new int[]{3, 5, 7};
        int sumArray = sumOfArray(array);
        System.out.println(sumArray);

        Scanner input = new Scanner(System.in);
        System.out.println("Please input the size of array: ");
        array = arrayWithRandomNumbers(input.nextInt()); // метод для 1 задачи
        System.out.println(Arrays.toString(array));
        float averageNum = averOfArray(array);  // метод для 5 задачи
        System.out.println("The average is: " + array);


        System.out.println("Enter max number of rows: ");
        stairs(input.nextInt());

    }

//Write a method that returns an array of a given size, filled in with random numbers from 1 to 20.

    public static int[] arrayWithRandomNumbers(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random() * 20 + 1);
        }
        return array;
    }

    //2.Write a method that takes two numbers and returns the value of one number raised to the power of another.

    public static int numberRaisedPowerAnother(int number, int degree) {
        int result = number;
        for (int i = 0; i < degree - 1; i++) {
            result = result * number;
        }
        return result;
    }

    //3.Write a method that takes an integer and then returns the number with its digits reversed.

    public static String digitsReversed(int s) {
        String reverse = new String();
        String ss = Integer.toString(s);
        for (int i = (ss.length() - 1); i >= 0; i--) {
            reverse += ss.charAt(i);
        }
        return reverse;
    }

    //4. Write a method to return the sum of values of the given array.

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

/*5. Write 2 methods with the same name to calculate average value of an array elements.
    Apply overloading principles.*/

    public static float averOfArray(int[] array) {
        int sum = 0;
        float result = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

            result = sum / array.length;
        }
        return result;
    }



//6. Write a method that prints out multiplication table of a given integer. Не смогла найти у себя задачу про таблицу умножения((
// 7.Write a method that prints out 'stairs' pattern according to given number of rows (as in task 6 from HW4).

     public static void stairs(int row) {
         char a = '#';
         System.out.println("Enter max number of rows: ");

         if (row <= 0) {
             System.out.println("You entered not positive value");
             return;
         }
         for (int i = 0; i < row; i++) {
             for (int j = 0; j < i + 2; j++) {
                 System.out.print(a);
             }
             System.out.println();
         }
     }

//8. Write a method that prints out rectangle of * sign according to given height and width.



