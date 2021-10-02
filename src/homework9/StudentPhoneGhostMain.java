package homework9;

import homework10Vehicle.*;
import homework10Animal.*;

public class StudentPhoneGhostMain {
    public static void main(String[] args) {

        Phone iPhone = new Phone("098867675", "5f", 100);
        Phone Sumsung = new Phone("09565453453", "Galaxy");

        System.out.println(iPhone.getNumber());
        System.out.println(Sumsung.getNumber());

        iPhone.receiveCall("Peter");
        Sumsung.receiveCall("Jane", "0976765564");// Phone

        Student student = new Student("Olga", "Okhrim", "AQA", 2); // Student
        Student student1 = new Aspirant("Helga", "Pataki", "AQA", 5, "5 level");
        Student student2 = new Aspirant("Bogdan", "Ivanov", "AQA", 7, "3 level");
        Student student3 = new Student("Igor", "Poloz", "AQA", 12);
        Student[] students = {student, student1, student2, student3}; // г) Создать массив типа Student, содержащий объекты класса Student и Aspirant.
        // Вызвать метод getScholarship() для каждого элемента массива, выводить в консоль имя студента и размер его стипендии.
        for (Student stud : students) {
            System.out.println(stud.getFirstName() + " " + " have a scholarship amount: " + stud.getScholarship());
        }

        Ghost ghost = new Ghost();
        System.out.println(ghost.getColor());



        }
    }








