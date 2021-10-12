package homework12Clothes;

public class Skirt extends Clothes implements WomanClothes {
    String name;

    public Skirt( int cost, String color, String name,Size size) {
        super (cost, color, name,size);
    }


    public String getName() {
        return name;
    }

    @Override
    public void dressUpWoman() {

    }
}
