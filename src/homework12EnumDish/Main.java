package homework12EnumDish;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
      restaurant.printMenu();
      restaurant.selectDish(Dish.VARENUKU_S_KARTOPLA);
   }
}

