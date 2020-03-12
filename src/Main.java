import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz portfel:\n 1. EUR\n 2. PLN\n 3. Dolar");
        int portfel = sc.nextInt();

        System.out.println("Jaka ilość pieniędzy?");

        double money = sc.nextDouble();

        Wallet wallet = null;

        switch (portfel) {
            case 1:
                wallet = new EuroWallet(money);
                break;
            case 2:
                wallet = new PlnWallet(money);
                break;
            case 3:
                wallet = new DolarWallet(money);
                break;
        }

        run(sc, wallet);

    }

    public static void run(Scanner sc, Wallet wallet) {
        Character operation;
        System.out.println("Podaj jaką chcesz wykonać operację:\n + wpłacenie pieniędzy \n - wypłacenie pieniędzy\n x koniec ");
        operation = sc.next().charAt(0);
        if (operation.equals('x')) {
            return;
        }
        System.out.println("Podaj kwote");
        double moneyTemp = sc.nextDouble();

        switch (operation) {
            case '+':
                wallet.addMoney(moneyTemp);
                System.out.println(wallet);
                break;
            case '-':
                wallet.spendingMoney(moneyTemp);
                System.out.println(wallet);
                break;
            default:
                System.out.println("Niewspierana operacja");
                System.out.println(wallet);
        }
        run(sc, wallet);
        //zmina
    }
}
