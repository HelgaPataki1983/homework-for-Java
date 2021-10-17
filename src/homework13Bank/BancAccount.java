package homework13Bank;

public class BancAccount {
    private int balance = 100;
    private int limit = 50;

    public void depositMoney(int sum) {
        balance += sum;
        System.out.println("You successfully deposited " + sum + " USD. " +
                "\nCurrent balance is " + getBalance());
    }

    public void withdrawMoney(int sum) {

        try {
            if (sum <= getBalance() && sum <= getLimit()) {
                balance -= sum;
                System.out.println("You successfully withdrew " + sum + " USD. " +
                        "\nCurrent balance is " + getBalance());
            } else if (sum <= getBalance() && sum > getLimit()) {
                System.out.println("You cant withdow " + sum + " USD. " +
                        "\nYou exceeded limit " + getLimit());
                throw new InsufficientMoneyException("You try withdrow more then limit allow, limit is:" + this.limit + " USD. ");
            } else {
                System.out.println("You try to withdraw " + sum);
                throw new InsufficientFundsException("You don't have enough money on your account, " +
                        "available sum is: ", getBalance());
            }
        } catch (InsufficientFundsException | InsufficientMoneyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        try {
            if (sum <= limit) {
                balance -= sum;
                System.out.println("You successfully withdrew " + sum + " USD. " +
                        "\nCurrent balance is " + getBalance());
            } else {
                System.out.println("You try to withdraw " + sum);
                throw new InsufficientMoneyException("You try withdrow more then limit allow, limit is: " + this.limit + " USD. ");
            }

        } catch (InsufficientMoneyException a) {
            System.out.println(a.getMessage() + a.getAmount());
            a.printStackTrace();
        }
    }


    public int getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }
}
