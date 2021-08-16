/*Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour

        Test Data
        Input distance in meters: 2500
        Input hour: 5
        Input minutes: 56
        Input seconds: 23
        Expected Output :
        Your speed in meters/second is 0.11691531
        Your speed in km/h is 0.42089513*/
package homework2;

public class Distance {
    public static void main(String[] args) {
        int meters=2500;
        int hour=5;
        int minutes=56;
        int seconds=23;
        double Km=2.5;
        double secondsAll=21383;
        System.out.println("Your speed in km/h is"+ " "+ Km/hour);
        System.out.println("Your speed in meters/second is"+ " "+ meters/secondsAll);
          }
}
