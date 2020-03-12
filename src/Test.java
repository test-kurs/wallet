public class Test {
    public static void main(String[] args) {
        JanuszWallet januszWallet = new JanuszWallet();
        System.out.println(januszWallet.amountOfMoney());
        System.out.println(januszWallet.spendingMoney(50));
        System.out.println(januszWallet.addMoney(120.5));

        System.out.println(januszWallet);
    }
}
