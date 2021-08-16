package homework3;
/*Write a program which takes a number of month from user and prints out name of season (summer, winter ...) Use input from console!
Input example: 4
Expected output: "It's a spring season!" //you can customize your message, be creative;)*/
/*
import java.util.Scanner;
public class NameOfSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter number of month");
        int numberOfMonth = input.nextInt();
        if ((numberOfMonth == 12 || numberOfMonth == 1 || numberOfMonth == 2)) {
            System.out.println("It's a winter season!");}
        if ((numberOfMonth == 3 || numberOfMonth == 4 || numberOfMonth == 5)) {
            System.out.println("It's a spring season!");        }
        if ((numberOfMonth == 6 || numberOfMonth == 7 || numberOfMonth == 8)) {
            System.out.println("It's a summer season!");        }
        if ((numberOfMonth == 9 || numberOfMonth == 10 || numberOfMonth == 11)) {
            System.out.println("It's a autumn season!");        }
        else {System.out.println("Sorry, I don't know this season...");        }
    }
}*/

import java.util.Scanner;

public class NameOfSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter number of month");
        int numberOfMonth = input.nextInt();
        switch (numberOfMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("It's a winter season!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's a spring season!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's a summer season!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It's an autumn season!");
                break;
             default:
                System.out.println("Sorry, I don't know this season...");}}}