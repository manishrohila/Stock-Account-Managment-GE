import java.time.LocalDateTime;

public class CompanyShares {
    private String stockSymbol;
    private int numberOfShares;
    private LocalDateTime transactionDateTime;

    public CompanyShares(String stockSymbol, int numberOfShares) {
        this.stockSymbol = stockSymbol;
        this.numberOfShares = numberOfShares;
        this.transactionDateTime = LocalDateTime.now();
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void updateShares(int shares) {
        this.numberOfShares += shares;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }
}
