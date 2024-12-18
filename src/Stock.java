public class Stock {
    private String stockName ;
    private int numberOfShare;
    private  double sharePrice;

    public Stock(String stockName, int numberOfShare, double sharePrice) {
        this.stockName = stockName;
        this.numberOfShare = numberOfShare;
        this.sharePrice = sharePrice;
    }
    public double calculateValue(){
        return sharePrice*numberOfShare;
    }
    public void displayReport(){
        System.out.printf("Stock Name: %s, Shares : %d, Share Price : %.2f, Total Value: %.2f\n",
                stockName,numberOfShare,sharePrice,calculateValue());
    }

}
