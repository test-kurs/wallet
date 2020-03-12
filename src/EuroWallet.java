public class EuroWallet extends Wallet {

    private double money;

    public EuroWallet(double money){
        moneyType = MoneyType.EUR;
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
