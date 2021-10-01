package homework9;

public class Aspirant extends Student{
private String scientificWork;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork ) {
        super(firstName, lastName, group, averageMark );
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() { //Переопределить этот метод в классе Aspirant.
                                                    // Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
         if (getAverageMark()== 5){
            return 200;
        }
        else {
            return 180;
        }
  }
    }
