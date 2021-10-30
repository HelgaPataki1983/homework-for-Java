

package homework13OtherExceptions;

public class OtherExceptions {
    public String zero;
//вызвать у переменной метод


    private boolean isitRaining;
    private int temperature;
    private boolean isitSunny;

    public OtherExceptions() {
        this.isitRaining = isitRaining;
        this.temperature = temperature;
        this.isitSunny = isitSunny;
    }

    public void isWeatherGood(boolean isitRaining, int temperature, boolean isitSunny){
        try {
       if (isitRaining == true && temperature < 10 && isitSunny == false){
           throw new WeatherIsNotGood("The weather is not good");
       }
       else {
           System.out.println("The weather is good");
       }
    }
        catch (WeatherIsNotGood exception){
            System.out.println(exception.getMessage());
        }

    }




}


