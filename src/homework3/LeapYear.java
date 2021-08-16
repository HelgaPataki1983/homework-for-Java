package homework3;
/*Write a Java program that takes a year from user input and prints whether that year is a leap year or not. Use input from console!
        Input example: 2045
        Expected output: "Year 2045 is not a leap year"*/

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter year");
        int year = input.nextInt();
        int LeapYearOrNot = year % 4;
                if (LeapYearOrNot == 0) {
                    System.out.println("Your year is Leap ");}
                    else {System.out.println("Your year is not Leap ");}
                }
    }

