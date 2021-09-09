package homework5;
/*11. Add class MainTask.class
        In your main method within this class create a program to do the following:
        - ask user for a name and greet him/her
        - ask user for a number
        - create an array of random numbers (from 1 to 20) with the size provided by user
        - print out its contents
        - sum up the numbers within the array and display the result with message
        - find average of numbers within array and display the result with message
        - print out a multiplication table for the average value that you found in previous step// не нашла у себя такой задачи((
        - ask user for a number > 10 and < 1000
        - validate that input is within range, prompt the user until the valid number is entered, display it
        - reverse the digits of the given number, display the result
        - raise it to the power of 2, display the result
        - and finally print out the 'stairs' pattern with num of rows = sum of the numbers in the array which was found before / your user name l*/
import java.util.Arrays;
import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = (input.nextLine());
        System.out.println("Enter your last name ");
        String lastName = (input.nextLine());
        OperationsWithIntArray.printPersonalGreeting(name, lastName);
        System.out.print("Please input the size of array: ");
        int[] arrayA = OperationsWithIntArray.arrayWithRandomNumbers(input.nextInt());
        System.out.println(Arrays.toString(arrayA));
        int sumArray = OperationsWithIntArray.sumOfArray(arrayA);
        System.out.println("Sum of your array is" + " " + sumArray);
        float averageNum = OperationsWithIntArray.averOfArray(arrayA);
        System.out.println("The average is: " + averageNum);
        System.out.println("Enter number > 10 and < 1000");
        int number = input.nextInt();
        if (number < 10)
        {
            System.out.println("You entered not valid value");
            return;
        }


    }
}
