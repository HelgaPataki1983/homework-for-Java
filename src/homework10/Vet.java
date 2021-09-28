package homework10;

public class Vet extends Animal{
   public Vet(String food, String location) {
      super(food, location);
   }

   public void treatAnimal(Animal animal){
      System.out.println(animal.getFood());
   }
}
