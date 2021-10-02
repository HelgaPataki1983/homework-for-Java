package homework10Animal;

import homework10Animal.Animal;

public class Horse extends Animal {
    private String horsesName;

    public Horse(String food, String location,String horsesName) {
        super(food, location);
        this.horsesName = horsesName;
    }

    @Override
    public void makeNoice() {
        System.out.println("Horse is making i-go-go");
    }

    @Override
    public void eat() {
        super.eat();
    }

    public String getHorsesName() {
        return horsesName;
    }
}
