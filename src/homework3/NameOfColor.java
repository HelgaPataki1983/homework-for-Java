package homework3;
/*Write the program which takes a name of color from user (red, blue, green, yellow, orange, black, white, pink)
        and print out length of this word. Use input from console!
        You can’t use .length() of String. Use switch operator.

import java.util.Scanner;

public class NameOfColor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a color");
        String numberOfColor = scan.nextLine();
        System.out.println("Number of Letters:");
                System.out.println(numberOfColor.length());}}*/


import java.util.Scanner;
public class NameOfColor {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter a color");
    String numberOfColor = scan.nextLine();
        switch (numberOfColor) {
            case "blue":
            case "pink":
        System.out.println("Number of Letters: 4");
                break;
            case "green":
            case "black":
            case "white":
        System.out.println("Number of Letters: 5");
                break;
            case "yellow":
            case "orange":
        System.out.println("Number of Letters: 6");
                break;
            case "red":
        System.out.println("Number of Letters: 3");
                break;
            }}}




