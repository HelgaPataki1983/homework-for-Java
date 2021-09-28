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

    public int getScholarship(double averageMark) {    //б) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.
                                                // Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
        int Scholarship=0;
           if (averageMark == 5){
            Scholarship=100;
        }
            else {
            Scholarship=80;
        }
        return Scholarship;
    }

    public double getAverageMark() {
        return this.averageMark;
    }

    public String getFirstName() {
        return this.firstName;
    }
}
