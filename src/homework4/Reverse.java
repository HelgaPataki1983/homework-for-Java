package homework4;
//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed and spaces between the digits.
        //For example, if the input is 12345, the output should be 5 4 3 2 1

import java.util.Scanner;
import static homework5.OperationsWithIntArray.digitsReversed;
public class Reverse
{
    public static void main(String[] args) {
        String reverse = digitsReversed(12345);
        System.out.printf("%s ", reverse);


        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String s = input.nextLine();
        for (int i = (s.length()-1); i >= 0; i--)
        {
            System.out.printf("%c ",s.charAt(i));*/
        }
    }



