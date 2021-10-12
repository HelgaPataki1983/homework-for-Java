package homework12Clothes;

public class Tie extends Clothes implements MenClothes{
    String name;
    public Tie(int cost, String color, String name,Size size) {
        super(cost, color, name, size);
    }


    public String getName() {
        return name;
    }

    @Override
    public void dressUpMan() {

    }
}
