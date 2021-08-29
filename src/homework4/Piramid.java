package homework4;
/*Write a program that takes a max number of rows from user and prints
out # sign with the following pattern: first row ## and every following row
increments qty by 1, so the second will be ###, third #### until we reach the qty of
rows that was input by user.
        Use loops, make validations for user input (negative, empty)
        Example:
        int max = 8; //this number must be read from console, user input

        Output:
        ##
        ###
        ####
        #####
        ######
        #######
        ########
        #########*/

import java.util.Scanner;

public class Piramid
{
    public static void main(String[] args)
    {
        char a = '#';
        Scanner input = new Scanner(System.in);
        System.out.println("Enter max number of rows: ");
        int row = input.nextInt();
        if (row <= 0)
        {
            System.out.println("You entered not positive value");
            return;
        }
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < i + 2; j++)
            {
                System.out.print(a);

            }
            System.out.println();

        }
    }
}







