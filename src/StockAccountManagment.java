import java.util.Scanner;

public class StockAccountManagment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockAccount stockAccount = new StockAccount();

        stockAccount.buy("AAPL", 10);
        stockAccount.buy("GOOGL", 15);
        stockAccount.sell("AAPL", 5);
        stockAccount.sell("GOOGL", 20);
        stockAccount.printReport();
        stockAccount.save("account_data.txt");

        scanner.close();
    }
}
