package homework3;
/*Is it morning, day or evening? In case time more than 18, show Good evening,
 before 10 Good morning, otherwise Good day. Use input from console. */

import java.util.Scanner;

public class MornDayEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your time: ");
        int time = input.nextInt();
        if(time >= 18 && time < 24){System.out.println("Good evening");}
        else if(time < 10 && time >= 24){System.out.println("Good morning");}
        else if(time > 10 && time < 18){System.out.println("Good day");}
        else {System.out.println("You put in a wrong time");}}}

/*&& time >= 24- не работает это выражение в 13 строке, обьясни плз почему*/
