package homework4;

import java.util.Scanner;
import static homework5.OperationsWithIntArray.numberRaisedPowerAnother;
//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
        //(Do not use Java built-in method Math.pow)
public class DegreeOfNumber {
    public static void main(String[] args) {
        int number = 3;
        int degree = 2;
        int result = numberRaisedPowerAnother(number, degree);
        System.out.printf("Number %d raised to power %d = %d \n", number, degree, result);
    }
}

        /*Scanner input = new Scanner(System.in);
                System.out.println("Enter number" );
        int number = input.nextInt();
        System.out.println("Enter degree" );
        int degree = input.nextInt();
        int result = number;
        for(int i = 0; i < degree -1; i++)
            result = result * number;
        System.out.print(result);
    }
}*/
