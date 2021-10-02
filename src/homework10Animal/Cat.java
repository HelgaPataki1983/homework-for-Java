package homework10Animal;

import homework10Animal.Animal;

public class Cat extends Animal {
    private String catsName;

    public Cat(String food, String location, String catsName) {
        super(food, location);
        this.catsName = catsName;
    }

    @Override
    public void makeNoice() {
        System.out.println("Cat is making may-may");
    }

    @Override
    public void eat() {
        super.eat();
    }

    public String getCatsName() {
        return catsName;
    }
}
