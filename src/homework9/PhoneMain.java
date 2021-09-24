package homework9;

public class PhoneMain {
    public static void main (String[] args) {

        Phone iPhone = new Phone ("098867675", "5f", 100);
        Phone Sumsung = new Phone("09565453453", "Galaxy");

        System.out.println(iPhone.getNumber());
        System.out.println(Sumsung.getNumber());

        iPhone.receiveCall("Peter");
        Sumsung.receiveCall("Jane", "0976765564");


    }
}
