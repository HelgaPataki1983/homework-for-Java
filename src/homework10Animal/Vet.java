package homework10Animal;

import homework10Animal.Animal;

public class Vet {

    public void treatAnimal(Animal anim){
      System.out.println("My animal eat " + anim.getFood() + " and leave in the " + anim.getLocation());
   }
}
