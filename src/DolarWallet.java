public class DolarWallet extends Wallet {

    private double money;

    public DolarWallet(double money) {
        moneyType = MoneyType.$;
        this.money = money;
    }

    @Override
    public double addMoney(double money) {
        return this.money += money;
    }

    @Override
    public double spendingMoney(double money) {
        return this.money -= money;
    }

    @Override
    public double amountOfMoney() {
        return money;
    }
}
