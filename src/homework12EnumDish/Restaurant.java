package homework12EnumDish;

public class Restaurant   {
    public void printMenu(){
        for (Dish dish: Dish.values()){
            dish.ingredients();
        }

    }
    public void selectDish(Dish dish){
        System.out.println("Your dish is " + dish.getName() + ", time to prepare is " + dish.getPreparationTime() + " hours");
    }



}
