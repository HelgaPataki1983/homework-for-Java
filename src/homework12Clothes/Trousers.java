package homework12Clothes;

public class Trousers extends Clothes implements MenClothes,WomanClothes {
    String name;
    public Trousers(int cost, String color, String name,Size size) {
        super(cost, color, name, size);
    }


    public String getName() {
        return name;
    }

    @Override
    public void dressUpMan() {

    }

    @Override
    public void dressUpWoman() {

    }
}
