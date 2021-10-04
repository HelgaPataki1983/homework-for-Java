package homework10Vehicle;
/*.
Write a program which will have:
3 level of inheritance (classes similar to the image below) with described variables and methods
        (add some actions to methods body, for example print some text to console).
        2.	Use every variable and method for objects of MountainBicycle and RoadBicycle
        (Remember that all non-private variables from parent class are available). Do that in main() in Runner class.
        Set some values for variables, use methods if variables are private.
        3.	Overloading and overriding. Override speedUp() and applyBrake() in Bicycle and add new behavior (other than in Vehicle).
        Overload constructor in Bicycle.
        Use speedUp() and applyBrake() for Car object and Bicycle object
        Use both overloaded constructors.
        4.	Override hashCode() and equals() in Helicopter. Create few objects of Helicopter and compare them using ‘==’ and equals().
        Create few objects of RoadBicycle and compare them using ‘==’ and equals().
        5.	Set some values to variables of Car. Print them out in console.
*/

public abstract class Vehicle implements EverythingOnWheels {
    int speed;
    private String model;

    String speedUp(int value){
        System.out.println("Vehicle have a general speed up approximately " + value);

        return null;
    };
    void applyBreak(int value){
        System.out.println("Vehicle have a general apply break approximately " + value);
    };

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    abstract public void move();
    final void stop(){
        System.out.println("Vehicle can stop");
    }

    @Override
    public void haveAFourWheels(String var) {
        System.out.println("it also has a 4 wheels");
    }
}
