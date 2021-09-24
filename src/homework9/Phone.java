package homework9;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String num, String model) {
        this.number = num;
        this.model = model;//        конструктор с двумя параметрами
    }
   public Phone(String num, String model, int weight){
            this.number = num;
            this.model = model;
            this.weight = weight;
        }
        public void receiveCall (String callerName){
            System.out.println(callerName + "is calling you");

        }
        public void receiveCall (String callerName, String callerId){ // перегруженый метод receiveCall
            System.out.println(callerName + "is calling you + with caller id");


        }
        public void sendMessage (String...telephoneNumbers){
            for (String number : telephoneNumbers) {
                System.out.println(number);
            }

        }

        public String getNumber () {
            return number;
    }
}
