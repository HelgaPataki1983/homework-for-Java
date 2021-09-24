package homework7;

import java.util.Objects;

/*Create 2 classes, each contains 2 variables. In first class override equals and hashcode.
        Create few instances of both classes and compare them using ‘==’ and equals()*/
public class Task5 {
    String variable;
    String variable1;

    public Task5(String variable, String variable1) {
        this.variable = variable;
        this.variable1 = variable1;
    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task5 task5 = (Task5) o;
        return Objects.equals(variable, task5.variable) && Objects.equals(variable1, task5.variable1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variable, variable1);
    }
}
/*public boolean equals(Task5 task5) {
        return this.variable == task5.variable;*/
