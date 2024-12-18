import java.util.ArrayList;

public class StockAccount {
    private ArrayList<CompanyShares> companyShares;

    public StockAccount() {
        this.companyShares = new ArrayList<>();
    }

    public double valueOf() {
        double totalValue = 0;
        for (CompanyShares share : companyShares) {
            totalValue += share.getNumberOfShares(); // Assuming share value calculation is external
        }
        return totalValue;
    }

    public void buy(String stockSymbol, int shares) {
        for (CompanyShares share : companyShares) {
            if (share.getStockSymbol().equals(stockSymbol)) {
                share.updateShares(shares);
                return;
            }
        }
        companyShares.add(new CompanyShares(stockSymbol, shares));
    }

    public void sell(String stockSymbol, int shares) {
        for (CompanyShares share : companyShares) {
            if (share.getStockSymbol().equals(stockSymbol)) {
                if (share.getNumberOfShares() >= shares) {
                    share.updateShares(-shares);
                } else {
                    System.out.println("Not enough shares to sell.");
                }
                return;
            }
        }
        System.out.println("Stock symbol not found.");
    }

    public void save(String filename) {
        // Placeholder for file save logic
        System.out.printf("Saving account data to %s...\n", filename);
    }

    public void printReport() {
        System.out.println("\n---- Stock Account Report ----");
        for (CompanyShares share : companyShares) {
            System.out.printf("Stock Symbol: %s, Shares: %d, Date/Time: %s\n",
                    share.getStockSymbol(),
                    share.getNumberOfShares(),
                    share.getTransactionDateTime());
        }
    }
}
