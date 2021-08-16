package homework2;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter side a, b and sinA");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double sinA = scan.nextDouble();
        double area = Math.sqrt((a * b * sinA) / 2);
        System.out.println("The area of the triangle is " + area);
    }
}
