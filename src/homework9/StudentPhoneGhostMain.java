package homework9;

public class StudentPhoneGhostMain {
    public static void main (String[] args) {

        Phone iPhone = new Phone ("098867675", "5f", 100);
        Phone Sumsung = new Phone("09565453453", "Galaxy");

        System.out.println(iPhone.getNumber());
        System.out.println(Sumsung.getNumber());

        iPhone.receiveCall("Peter");
        Sumsung.receiveCall("Jane", "0976765564");// Phone

        Student student = new Student("Olga","Okhrim", "AQA", 2); // Student
        Student student1 = new Aspirant("Helga","Pataki","AQA",5);
        Student student2 = new Aspirant("Bogdan","Ivanov","AQA",7);
        Student student3 = new Student("Igor","Poloz", "AQA", 12);
        Student[] students = {student,student1,student2,student3}; // г) Создать массив типа Student, содержащий объекты класса Student и Aspirant.
        // Вызвать метод getScholarship() для каждого элемента массива, выводить в консоль имя студента и размер его стипендии.
        System.out.println(student.getFirstName() + " " + " have a scholarship amount: " + student.getScholarship(2));
        System.out.println(student1.getFirstName() + " " + " have a scholarship amount: " + student1.getScholarship(3));
        System.out.println(student2.getFirstName() + " " + " have a scholarship amount: " + student2.getScholarship(5));
        System.out.println(student3.getFirstName() + " " + " have a scholarship amount: " + student3.getScholarship(12));

        Ghost ghost = new Ghost();
        System.out.println(ghost.getColor());






    }
}
