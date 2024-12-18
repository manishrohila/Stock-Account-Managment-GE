public class Account {
    private double balance ;

    public Account(double balance) {
        this.balance = balance;
    }
    public void credit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    public void debit(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Debit amount exceeded the account balance");
        }
        else{
            balance-=amount;
        }
    }
    public double getBalance(){
        return balance;
    }

}
