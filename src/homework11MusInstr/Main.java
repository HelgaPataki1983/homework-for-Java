package homework11MusInstr;

public class Main {
    public static void main(String[] args) {
    MusInstrument instrument = new Guitar(12);
    MusInstrument instrument1 = new Drum("medium");
    MusInstrument instrument2 = new Tube(50);
    MusInstrument[]instruments = {instrument,instrument1,instrument2};
        System.out.println(Drum.play());// не могу ни из одного класса метод вызвать , ни из интерфейса , и из остальных, 
    {/*
        for (MusInstrument:instruments) {
            MusInstrument.play();
*/
        }
    }
}

