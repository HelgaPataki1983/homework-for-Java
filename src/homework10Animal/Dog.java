package homework10Animal;

import homework10Animal.Animal;

public class Dog extends Animal {
    private String dogsName;

    public Dog(String food, String location,String dogsName) {
        super(food, location);
        this.dogsName = dogsName;
    }

    @Override
    public void makeNoice() {
        System.out.println("Dog is making rrrrrr");
    }

    @Override
    public void eat() {
        super.eat();
    }

    public String getDogsName() {
        return dogsName;
    }
}
