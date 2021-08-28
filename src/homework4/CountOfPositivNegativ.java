package homework4;
/*Write a program that takes the numbers input by user till the user wants and as the result
it will output the count of positive, negative and zeros entered. Use do while loop.
        Example:
        Numbers that were input by user: 5, -2, 45, 0, 23, 14, -3
        Expected output:
        You entered 4 positive, 2 negative and 1 zero values.*/

import java.util.Scanner;

/*public class CountOfPositivNegativ {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
      // System.out.println("Enter any number : ");
       //int numbers = input.nextInt();
        int [] numbers = {1,7,-1,23,-6,0,0,26,-27,1};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for ( int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0){
                positive =  positive + 1; }
            if (numbers[i] < 0){
                negative =  negative + 1; }
            if (numbers[i] == 0){
                zero =  zero + 1; }
        }
            System.out.println("You entered" + " " + positive + " " + "positive, and" + " " + negative + " " + "negative, and" + " " + zero);}}*/

public class CountOfPositivNegativ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
               int positive = 0;
        int negative = 0;
        int zero = 0;
        int choose;

        do {
            System.out.println("Enter any number : ");
            int numbers = input.nextInt();
            if (numbers > 0) {
                positive = positive + 1;
            }
             else if (numbers < 0) {
                negative = negative + 1;
            }
            else {
                zero = zero + 1;
            }
            System.out.println("Do you want input more number? 1-Yes, 2-No : ");
             choose = input.nextInt();
        }
                while (choose == 1); {
                System.out.println("You entered" + " " + positive + " " + "positive, and" + " " + negative + " " + "negative, and" + " " + zero);
            }



    }
}