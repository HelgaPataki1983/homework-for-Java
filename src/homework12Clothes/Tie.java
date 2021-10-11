package homework12Clothes;

public class Tie extends Clothes implements MenClothes{
    String name;
    public Tie(int cost, String color, String name,Size size) {
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
