package homework7;

public class MainForAllTasks {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Olga", 67, "QA", 21223);

        System.out.println("Worker1: " + worker1.toString()); //2 задание - Add method toString() to Worker class. Add usage of toString() to main in other class.
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

        Dog dog1 = new Dog("white", "small", "kind"); //4 задание Add method toString() to Worker class. Add usage of toString() to main in other class.
        Dog dog2 = new Dog("big","friendly");
        Dog dog3 = new Dog("angry");
        dog1.eat();
        dog1.printСharacteristic();

        Dog.fangSize(); // 3 задание , вызов статического метода

        Task5 task5 = new Task5("pretty", "agly");//
        Task5 task5_1 = new Task5("pretty", "agly");
        System.out.println(task5 == task5_1);
        System.out.println(task5.equals(task5_1));
        //System.out.println(task5.hashCode(task5_1));

        Task5_1 task51 = new Task5_1("pretty", "agly");//
        Task5_1 task511 = new Task5_1("pretty", "agly");
        System.out.println(task51 == task511);
        System.out.println(task51.equals(task511));


    }

}
