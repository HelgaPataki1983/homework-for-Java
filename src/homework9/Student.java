package homework9;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName,String lastName,String group,double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark ; // а) Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
    }

    public double getAverageMark() {
        return this.averageMark;
    }
    public int getScholarship() {    //б) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.
                                                // Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
          if (getAverageMark()==5){
            return 100;
        }
            else {
            return 80;
        }
    }

    public String getFirstName(Student stud) {
        return this.firstName;
    }
}
