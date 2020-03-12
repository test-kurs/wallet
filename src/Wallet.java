public abstract class Wallet {

    public abstract double addMoney(double money);
    public abstract double spendingMoney(double money);
    public abstract double amountOfMoney();

    public MoneyType moneyType;

    @Override
    public String toString() {
        return "Wallet = " + amountOfMoney() + " " + moneyType;
    }
}
