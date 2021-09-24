package homework7;
/*Create new class Dog, which has one static method and one static field.
        Print out value of this variable, add usage of static method in main*/
/*4*//*) Create class with 3 variables and 3 constructors.
        Add usage of all constructor and variables in main method in other class*/

public class Dog {
    static String fangSize = "Really big";

    private String color;
    private String size;
    private String characteristic;

    public Dog(String color, String size, String characteristic) {
        this.color = color;
        this.size = size;
        this.characteristic = characteristic;
    }

    public Dog(String size, String characteristic) {
        this.size = size;
        this.characteristic = characteristic;
    }

    public Dog(String characteristic) {
        this.characteristic = characteristic;
    }

    public void eat() {
        System.out.println("Dog can eat");
    }

    public void printСharacteristic() {
        System.out.println("This dog " + color + " " + size + " and " + characteristic + ".");
    }

    public static void fangSize() {     //  3 static method
        System.out.println("The fang size my dog is " + fangSize);
    }
}

