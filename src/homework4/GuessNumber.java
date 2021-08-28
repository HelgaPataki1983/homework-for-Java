package homework4;

import java.util.Random;
import java.util.Scanner;

/*Write a program that generates a random number and asks the user to guess what the number is.
If the user's guess is higher than the random number, the program should display "Too high, try again."
If the user's guess is lower than the random number, the program should display "Too low, try again."
The program should use a loop that repeats until the user correctly guesses the random number.
        To generate a random number between 0 and 10 use the following method:
        int number = (int) (Math.random() * 10) + 1;*/
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess;
        int a = 0;
        int b = 10;
        int random = a + (int) (Math.random() * b);
        do {
            System.out.println("Enter number ");
            guess = input.nextInt();
            if (random == guess) {
                System.out.println("You are right, yoohhoo");
                break;
            }

            if (guess < random) {
                System.out.println("Too low, try again. ");
                continue;
            }
            if (guess > random) {
                System.out.println("Too High, try again. ");
                continue;
            }

            }
        while (true);
        System.out.println("Good bye");
        }



    }

