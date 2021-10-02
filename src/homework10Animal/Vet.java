package homework10Animal;

import homework10Animal.Animal;

public class Vet {
String animalType;
    public void treatAnimal(Animal anim){

      if (anim instanceof Cat) {
          animalType = "cat";
      } else if (anim instanceof Dog){
              animalType = "dog";
          }
      else if (anim instanceof Horse){
          animalType = "horse";
      }
        System.out.println("My " + animalType + " " + anim.getFood() + " and leave in the " + anim.getLocation());
      }
   }

