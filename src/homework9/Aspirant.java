package homework9;

public class Aspirant extends Student{
    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship(double averageMark) { //Переопределить этот метод в классе Aspirant.
                                                    // Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
        int Scholarship=0;
        if (averageMark== 5){
            Scholarship=200;
        }
        else {
            Scholarship=180;
        }
        return Scholarship;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }
}
