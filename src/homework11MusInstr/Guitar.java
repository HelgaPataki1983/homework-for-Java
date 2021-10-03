package homework11MusInstr;

public class Guitar implements MusInstrument{
    int stringCount;

    public Guitar(int stringCount) {
        this.stringCount = stringCount;
    }


    @Override
    public void play() {
        System.out.println("Guitar has a " + stringCount + "strings");



    }
}
