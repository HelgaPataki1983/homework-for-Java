package homework4;
/*You have to design the code such that the user has only three tries to guess the correct pin of the account.
        You set the pin as a constant with a final attribute. When correct display “Correct, welcome back.”
        When incorrect display “Incorrect, try again.”. When ran out of tries display “Sorry but you have been locked out.”*/


import java.util.Scanner;

public class PinValidator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int pin = 123;
        int counter = 3;
        for (int i = 1; i <= 3; i++)
        {
            System.out.println("Please, enter pin");
            int userTty = input.nextInt();
            if ((userTty != pin) && i ==3) // it didnt work if stay in a first position. the system locked from the first try.
            {
                System.out.println("Incorrect, try again.");
            }
            else if (userTty != pin)
            {
                System.out.println("Sorry but you have been locked out.");
                return;
            }
            else  {
                System.out.println("Correct, welcome back.");
                break;
            }

        }

    }

}
