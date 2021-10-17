package homework13Bank;

public class Main {
    public static void main(String[] args) {
        BancAccount bank = new BancAccount();
        bank.depositMoney(100);
        bank.depositMoney(200);


        bank.withdrawMoney(150);
        bank.withdrawMoney(500);
        bank.withdrawMoney(100);



    }
}
