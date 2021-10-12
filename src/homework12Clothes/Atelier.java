package homework12Clothes;

public class Atelier {

    public void dressMan(Clothes[] clothess) {
        for (Clothes cl : clothess) {
            if (cl instanceof MenClothes)
                System.out.print(cl.getName() + "\n" + "Size " + cl.getSize() + "(euro size: " + cl.getSize().euroSize + ", " + cl.getSize().getDescription() + ")" + "\n" + "Cost is - " + cl.getCost() + "$\n" + "Color is - " + cl.getColor() + "\n" + "------------------------------");
            System.out.println();
        }
    }
    public void dressWoman(Clothes[] clothess){
        for (Clothes cl : clothess) {
            if (cl instanceof WomanClothes)
                System.out.print(cl.getName() + "\n" + "Size " + cl.getSize() + "(euro size: " + cl.getSize().euroSize + ", " + cl.getSize().getDescription() + ")" + "\n" + "Cost is - " + cl.getCost() + "$\n" + "Color is - " + cl.getColor() + "\n" + "------------------------------");
            System.out.println();
        }
    }
}
