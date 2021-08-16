package homework3;
/*Create program that logs you into system. Check name validity. Check password length. Example:
        Enter your name:  Helen (in case the name is empty print error)
        Enter your password:  pass (in case wrong pass print error)*/

import java.util.Scanner;

public class LogInProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your login");
        System.out.println("Enter your password");
        String name = input.nextLine();
        String password = input.nextLine();
        if (name.isEmpty())
        {System.out.println("You dint put name");}
        if (password.isEmpty())
        {System.out.println("You dint put name");}
        else if (password.length() < 5)
        {System.out.println("Your password is too short, please try again");}




    }
}
