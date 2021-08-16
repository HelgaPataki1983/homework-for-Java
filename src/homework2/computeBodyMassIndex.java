/*Write a Java program to compute body mass index (BMI).
        Test Data
        Input weight in pounds: 452
        Input height in inches: 72
        Expected Output:
        Body Mass Index is 61.295524691358025*/
package homework2;
public class computeBodyMassIndex {
    public static void main(String[] args) {
        int weight=452;
        int height=72;
        System.out.println(Math.pow(height, 2)/weight);
    }

}
/*Не получается твой результат, ты по какой формуле считала?(вес деленный на рост в квадрате?)*/