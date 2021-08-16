package homework3;
/*Is it day or evening? In case time is more than 18, show Good evening,
 otherwise Good day. Try to use IF and Ternary.*/


/*public class DayOrEvening {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your time: ");
        double evening= input.nextDouble();
        if ((evening > 18 )) {System.out.println("Good evening!");}
        else {System.out.println("Good day");}}}*/

import java.util.Scanner;

public class DayOrEvening {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your time: ");
        double evening= input.nextDouble();
        String time = (evening > 18) ? "evening" : "day";
        System.out.println("Good" + " " + time);}}
