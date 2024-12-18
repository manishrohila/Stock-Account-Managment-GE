public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(2000);
        System.out.println("Initial Amount "+ "2000");
        System.out.println("Amount 500 is added ");
        account.credit(500);
        System.out.println("Updated Balance "+ account.getBalance());
        System.out.println("Amount 300 is debited");
        account.debit(300);
        System.out.println("Updated balance "+ account.getBalance());

    }
}
