package homework11Printable;

public class Magazine implements Printable{
private String nameOfMagazine;
    public Magazine(String nameOfMagazine) {
        this.nameOfMagazine = nameOfMagazine;

    }
    public String getNameOfMagazine() {
        return nameOfMagazine;
    }

    @Override
    public void print() {
        System.out.println("Im a magazine " + getNameOfMagazine());
    }
    static void printMagazine(Printable[] prin){
        for (Printable pr:prin){
            if (pr instanceof Magazine) {
                System.out.println(((Magazine) pr).getNameOfMagazine());
            }

        }

    }

}




