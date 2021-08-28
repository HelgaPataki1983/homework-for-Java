package homework4;
/*Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.*/

import java.util.Scanner;

public class PositivInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println("Enter a positive number");
      int number = input.nextInt();
        if (number < 0){
            System.out.println("You entered not positive value");
            return;}
                 int[]table = new int[10]; /* непонятно почему масив из 11 елементов если в таблице 10 цифр*/
            for (int i = 0; i < table.length;i++){
             table[i] = (i+1) * number;
                //{System.out.printf("%1$1d x %2$2d = %3$2d\n", number, i, table[i]);}
                System.out.printf("%d x %d = %d\n", number, i+1, table[i]);

                   }}}




