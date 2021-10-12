package homework12Clothes;

public class TShirt extends Clothes implements MenClothes, WomanClothes {
    String name;
    public TShirt(int cost, String color, String name,Size size) {
        super(cost, color, name, size);
    }

    @Override
    public void dressUpMan() {
    }

    @Override
    public void dressUpWoman() {
    }

    public String getName() {
        return name;
    }
}
