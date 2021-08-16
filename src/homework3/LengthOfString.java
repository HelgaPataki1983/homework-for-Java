package homework3;
/*Check length of string, if string is more than expected print error.8*/

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text that is 10 characters long ");
        String LengthOfString = input.next();
        if ((LengthOfString.length()) <= 10){System.out.println("Ok");}
        else {System.out.println("Error");}}}

