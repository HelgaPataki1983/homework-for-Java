package homework10;

public class Dog extends Animal{
    private String dogsName;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoice() {
        System.out.println("Dog is making rrrrrr");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
