package homework2;

public class Convert {
    public static void main(String[] args) {
                       int minutes = 3456789;
        int years = minutes / (60 * 24 * 365);
        int remainMinutes = minutes % (60 * 24 * 365);
        int days = remainMinutes / (60 * 24);
        System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, days);
    }
}


