package homework10Vehicle;

public interface EverythingOnWheels {
    default void haveAFourWheels(String var) {
        System.out.println("it has a 4 wheels");
    }
    static void onlyForThisClass(){
        System.out.println("you cant use me in another class");
    }
abstract public void takePassengers(int var);
}
