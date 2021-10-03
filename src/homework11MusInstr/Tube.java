package homework11MusInstr;

public class Tube implements MusInstrument{
      int diameter;

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Tube has a diameter = " + diameter);




    }
}
