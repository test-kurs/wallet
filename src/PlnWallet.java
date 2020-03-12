public class PlnWallet extends Wallet {

    private double money;

    public PlnWallet(double money){
        moneyType = MoneyType.$;
        this.money = money;
    }

    @Override
    public double addMoney(double money) {
        return this.money +=  money;
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
