import java.util.ArrayList;

public class StockPortfolio {
    private ArrayList<Stock> stocks;

    public StockPortfolio() {
        this.stocks = new ArrayList<>();
    }
    public void addStock(Stock stock){
        stocks.add(stock);
    }
    public void displayPortfolioReport(){
        double totalValue =0;
        System.out.println("\n---- Stock Portfolio Report ----");
        for(Stock stock : stocks){
            stock.displayReport();
            totalValue+= stock.calculateValue();
        }
        System.out.println("Total value of all the Stocks :"+ totalValue);
    }
}
