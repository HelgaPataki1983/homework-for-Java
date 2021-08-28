package homework4;
/*You have to design the code such that the user has only three tries to guess the correct pin of the account.
        You set the pin as a constant with a final attribute. When correct display “Correct, welcome back.”
        When incorrect display “Incorrect, try again.”. When ran out of tries display “Sorry but you have been locked out.”*/


import java.util.Scanner;

public class PinValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 123;
        int counter = 3;
        for (int i = 0; i <= 3; i++){
            System.out.println("Please, enter pin");
            int userTty = input.nextInt();
            if (userTty != pin){
                System.out.println("Incorrect, try again.");
            }
             if (userTty == pin) {
                System.out.println("Correct, welcome back.");
                break;
            }
             if ((userTty != pin) && i ==4) {
                System.out.println("Sorry but you have been locked out.");
                return;
        }

    }

}}
