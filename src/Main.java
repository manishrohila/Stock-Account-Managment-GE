import java.nio.channels.Pipe;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockPortfolio stockPortfolio = new StockPortfolio();
        System.out.println("Enter the number of stocks ");
        int numberOfStocks = scanner.nextInt();
        for(int i =0;i<numberOfStocks ;i++){
            System.out.println("Enter the name of the Stock ");
            String stockName = scanner.next();
            System.out.println("Enter the price of the Stock");
            int sharePrice = scanner.nextInt();
            System.out.println("Enter the number of share");
            int numberOfShare = scanner.nextInt();
            Stock stock = new Stock(stockName,numberOfShare,sharePrice);
            stockPortfolio.addStock(stock);
        }
        stockPortfolio.displayPortfolioReport();
        scanner.close();
    }
}