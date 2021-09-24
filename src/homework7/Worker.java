package homework7;
/*Create class Worker with next fields: String name, int age, String position, int salary.
        Give some default values to these fields and add constructor which add new values to them.
        Add getters and setters. Use all of methods in main in other class.
        2) Add method toString() to Worker class. Add usage of toString() to main in other class.*/

public class Worker {
    private String name;
    private int age;
    private String position;
    private int salary;

    public Worker(String name, int age, String position, int salary  ) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
      return age;
    }
    public String getPosition(){
        return position;
            }
    public int getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String toString() {
        return "Worker{" + "name='" + name + '\'' + ", age=" + age + ", position=" + position + ", salary=" + salary + '}';
    }
}
