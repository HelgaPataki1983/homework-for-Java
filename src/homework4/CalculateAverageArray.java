package homework4;
/*Write a program to calculate average value of an array elements.
        Example array: {3, 5, 7}
        Expected output:
        The average is: 5.0*/

public class CalculateAverageArray {
    public static void main(String[] args) {
        int [] array = {5,7,9};
        int sum = 0;
        float result = 0;
        for (int i = 0; i < array.length; i++) {
             sum = sum + array[i];
        }
        result = sum / array.length;
        System.out.println("The average is: " + result);
        }
}

