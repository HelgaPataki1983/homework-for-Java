package homework10Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat("fish", "forest", "Boris");
        Animal animal1 = new Dog("meat", "forest", "Petro");
        Animal animal2 = new Horse("wheat", "forest", "Karlo");
        Vet veterinar = new Vet();
        Animal[] animals = {animal, animal1, animal2};

        {
            for (Animal anim : animals) {
                veterinar.treatAnimal(anim);
            }
        }
    }
}