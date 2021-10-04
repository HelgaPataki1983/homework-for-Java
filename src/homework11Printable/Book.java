package homework11Printable;

public class Book implements Printable {
    private String nameOfBook;

    public Book(String nameOfBook) {
        this.nameOfBook = nameOfBook;

    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    @Override
    public void print() {
        System.out.println("Im a book" + getNameOfBook());
    }

    static void printMagazine(Printable[] prin) {
        for (Printable pr : prin) {
            if (pr instanceof Book) {
                System.out.println(((Book) pr).getNameOfBook());
            }


        }
    }
}