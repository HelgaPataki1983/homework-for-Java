package homework13Bank;

public class InsufficientMoneyException extends Exception{
    private int amount;

    public InsufficientMoneyException(String message) {
        super(message);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
