package homework12Clothes;

public class AtelierMain {
    public static void main(String[] args) {
        Clothes menClothes = new Tie(35,"red","Tie",Size.M);
        Clothes womanClothes = new Skirt(40,"blue","Skirt", Size.XS);
        Clothes clothes = new Trousers(75,"white", "Trousers", Size.XXS);
        Clothes clothes1 = new TShirt(30,"mylticolor", "Tshirt", Size.L);
        Clothes[] clothess = {menClothes,womanClothes, clothes, clothes1};


        AtelierMain atelier = new AtelierMain();
        menClothes.dressUpMan(clothess);
        womanClothes.dressUpWoman(clothess);
        {
            for (Clothes cl : clothess) {
                if (cl instanceof MenClothes){
                    System.out.print(cl.getName() +"\n" + "Size "+  cl.getSize() + "(euro size: " + cl.size.euroSize + ", "+ cl.size.getDescription()+ ")"+ "\n"+"Cost is - " + cl.getCost() +"$\n" + "Color is - " +cl.getColor() + "\n"+ "------------------------------");
                    System.out.println();
                } else if (cl instanceof WomanClothes){
                    System.out.print(cl.getName() +"\n" + "Size "+  cl.getSize() + "(euro size: " + cl.size.euroSize + ", "+ cl.size.getDescription()+ ")"+ "\n"+"Cost is - " + cl.getCost() +"$\n" + "Color is - " +cl.getColor() + "\n"+ "------------------------------");
                    System.out.println();//не работает второе условие, не пойму почему, и я не смогла вытянуть
                    //В отдельном классе создать массив, содержащий все типы одежды
                    // (перед этим создать несколько объектов одежды разных классов - и это не пойму как реализовать, если он не наследник ,и как в мейн в метод масив передать если он в другом класе
                }


            }

            }
        }
    }

/* if (anim instanceof Cat) {
         animalType = "cat";
         } else if (anim instanceof Dog){
         animalType = "dog";
         }
         else if (anim instanceof Horse){
         animalType = "horse";*/

