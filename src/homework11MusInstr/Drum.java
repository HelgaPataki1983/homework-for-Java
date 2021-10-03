package homework11MusInstr;

public class Drum implements MusInstrument{
    String size;

    public Drum(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Drum size is " + size );



    }

}
