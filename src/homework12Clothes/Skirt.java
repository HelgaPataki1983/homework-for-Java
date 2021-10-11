package homework12Clothes;

public class Skirt extends Clothes implements WomanClothes {
    String name;

    public Skirt( int cost, String color, String name,Size size) {
        super (cost, color, name,size);
        this.name = name;
    }
    @Override
    public void dressUpMan(Clothes[] text) {
    }
    @Override
    public void dressUpWoman(Clothes[] t) {
    }

    public String getName() {
        return name;
    }
}
