package homework3;
/*Print name of Weekday according to number. For example: Enter 1, Print “Monday”*/

import java.util.Scanner;

public class NameOfWeekday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of weekday use value from 1 to 7");
        int weekDay = input.nextInt();
        if (weekDay == 1){System.out.println("Its Sunday");}
        else if (weekDay == 2){System.out.println("Its Monday");}
        else if (weekDay == 3){System.out.println("Its Tuesday");}
        else if (weekDay == 4){System.out.println("Its Wednesday");}
        else if (weekDay == 5){System.out.println("Its Thursday");}
        else if (weekDay == 6){System.out.println("Its Friday");}
        else {System.out.println("Wrong value");}}}

