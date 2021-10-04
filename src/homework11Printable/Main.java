
package homework11Printable;

public class Main {
    public static void main(String[] args) {
        Printable book = new Book("All javas method");
        Printable magazine = new Magazine("All about QA");
        Printable[] things = {book, magazine};
        for (Printable print: things) {
            print.print();
        }
        Magazine.printMagazine(things);
        Book.printMagazine(things);
    }

}

