package homework7;
/*Create 2 classes, each contains 2 variables. In first class override equals and hashcode.
        Create few instances of both classes and compare them using ‘==’ and equals()*/
public class Task5_1 {
    String variable;
    String variable1;
    public Task5_1(String variable, String variable1) {
        this.variable = variable;
        this.variable1 = variable1;
    }

    public static void main(String[] args) {

        Task5 task5 = new Task5("pretty", "agly");
        Task5 task5_1 = new Task5("pretty", "agly");

        System.out.println(task5 == task5_1);
        System.out.println(task5.equals(task5_1));
        //System.out.println(task5.hashCode(task5_1));

    }

    public boolean equals(Task5 task5) {
        return this.variable == task5.variable;
    }
}
