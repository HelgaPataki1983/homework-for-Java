package homework7;

public class WorkerMain {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Olga", 67, "QA", 21223);

        System.out.println("Worker1: " + worker1.toString());
        System.out.println("Worker1: " + worker1.getName());
        worker1.setName("OlgaQ");
        System.out.println("Worker1: " + worker1.getName());
        System.out.println("Worker1: " + worker1.getPosition());
        worker1.setPosition("AQA");
        System.out.println("Worker1: " + worker1.getPosition());
        System.out.println("Worker1: " + worker1.getAge());
        worker1.setAge(38);
        System.out.println("Worker1: " + worker1.getAge());
        System.out.println("Worker1: " + worker1.getSalary());
        worker1.setSalary(23232323);
        System.out.println("Worker1: " + worker1.getSalary());


    }

}
