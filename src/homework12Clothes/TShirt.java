package homework12Clothes;

public class TShirt extends Clothes implements MenClothes, WomanClothes {
    String name;
    public TShirt(int cost, String color, String name,Size size) {
        super(cost, color, name, size);
        this.name = name;
    }

    @Override
    public void dressUpMan(Clothes[] t) {
    }

    @Override
    public void dressUpWoman(Clothes[] t) {
    }

    public String getName() {
        return name;
    }
}
